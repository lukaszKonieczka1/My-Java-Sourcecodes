import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Wypelnianie extends Thread{
    ArrayBlockingQueue<Integer> stol;
    AtomicInteger seryjny,magazyn;
    public Wypelnianie(ArrayBlockingQueue<Integer> stol, AtomicInteger seryjny, AtomicInteger magazyn){
        this.stol=stol;
        this.seryjny=seryjny;
        this.magazyn=magazyn;
    }
    @Override
    public void run() {
        int[] wypelnianie=new int[2];
        while(true){
            for(int i=0;i<2;i++){
                try {
                    wypelnianie[i]=stol.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(getName()+"-pobral ze stolu "+(i+1)+" obudowe o nr seryjnym "+wypelnianie[i]+"\n");
            }
            System.out.print(getName()+"-pobral 2 obudowy, wklada do srodka wklady z tuszem\n");
            try {
                sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(getName()+"-wlozyl wklady do mazakow, wklada mazaki do magazynu\n");
            for(int i=0;i<2;i++){
                magazyn.set(wypelnianie[i]);
            }
            System.out.print(getName()+"-umiescil mazaki w magazynie\n\n");
        }
    }
}
