import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Chlodzenie extends Thread{

    ArrayBlockingQueue<Integer> tasma1,stol;
    AtomicInteger seryjny;

    public Chlodzenie(ArrayBlockingQueue<Integer> tasma1,ArrayBlockingQueue<Integer> stol, AtomicInteger seryjny){
        this.tasma1=tasma1;
        this.stol=stol;
        this.seryjny=seryjny;
    }

    @Override
    public void run() {
        int[] chlodzenie=new int[4];
        while(true){
            for(int i=0;i<4;i++){
                try {
                    chlodzenie[i]=tasma1.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(getName()+"-pobral "+(i+1)+" obudowe do schlodzenia o nr seryjnym "+chlodzenie[i]+"\n");
            }
            System.out.print(getName()+"-rozpoczyna chlodzenie pobranych obudow\n");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(getName()+"-schlodzil obudowy, przekazuje je na stol montazowy\n");
            for(int i=0;i<4;i++){
                try {
                    stol.put(chlodzenie[i]);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(getName()+"-wlozyl na stol "+(i+1)+" obudowe o nr seryjnym "+chlodzenie[i]+"\n");
            }
            System.out.print(getName()+"-umiescil na stole wszystkie schlodzone obudowy\n");
        }
    }
}
