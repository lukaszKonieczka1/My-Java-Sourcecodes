import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand=new Random();
        double[] tab=new double[300000000];
        //-------------------------------------------
        //Number of threads (feel free to put your own value here):
        final int THREADNUM=4;
        //-------------------------------------------
        int help=300000000/THREADNUM,a=0,b=help;
        double finalmax,finalmin;
        MaxOrMin[] threads=new MaxOrMin[THREADNUM];

        for(int i=0;i<tab.length;i++){
            tab[i]=rand.nextDouble((2147483647-1)+1);
        }

        threads[0]=new MaxOrMin(tab,a,b);
        if (THREADNUM != 1) {
            for (int i = 1; i < THREADNUM; i++) {
                a = b + 1;
                b = b + help;
                if(i==THREADNUM-1 && 300000000-b!=0) {
                    b=b+(300000000-b);
                }
                threads[i] = new MaxOrMin(tab, a, b);
            }
        }
        long startTime=System.nanoTime();
        for (MaxOrMin thread : threads) {
            thread.start();
        }
        for(MaxOrMin thread:threads){
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
