import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand=new Random();
        int[] tab=new int[300000000];
        //-------------------------------------------
        //Number of threads (feel free to put your own value here):
        final int THREADNUM=1;
        //-------------------------------------------
        int help=300000000/THREADNUM,a=0,b=help,finalmax,finalmin;
        MinOrMax[] threads=new MinOrMax[THREADNUM];

        for(int i=0;i<tab.length;i++){
            tab[i]=rand.nextInt(2147483647-1)+1;
        }

        threads[0]=new MinOrMax(tab,a,b);
        if (THREADNUM != 1) {
            for (int i = 1; i < THREADNUM; i++) {
                a = b + 1;
                b = b + help;
                if(i==THREADNUM-1 && 300000000-b!=0) {
                    b=b+(300000000-b);
                }
                threads[i] = new MinOrMax(tab, a, b);
            }
        }
        long startTime=System.nanoTime();
        for (MinOrMax thread : threads) {
            thread.start();
        }
        for(MinOrMax thread:threads){
            thread.join();
        }

        finalmax=threads[0].getMax();
        finalmin=threads[0].getMin();
        for(int i=1;i<THREADNUM;i++){
            if(threads[i].getMax()>finalmax)
                finalmax=threads[i].getMax();
            if(threads[i].getMin()<finalmin)
                finalmin=threads[i].getMin();
        }
        long endTime=System.nanoTime();
        System.out.print("Najwieksza: "+finalmax+"\nNajmniejsza: "+finalmin+"\nCzas potrzebny na wykonanie programu: "+((endTime-startTime)/1000000)+"ms");
    }
}
