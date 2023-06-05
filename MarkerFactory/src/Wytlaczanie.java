import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Wytlaczanie extends Thread{

    ArrayBlockingQueue<Integer> tasma1;
    AtomicInteger seryjny;

    public Wytlaczanie(ArrayBlockingQueue<Integer> tasma1, AtomicInteger seryjny){
        this.tasma1=tasma1;
        this.seryjny=seryjny;
    }

    @Override
    public void run() {
        int bufor;
        while(true){
            bufor=seryjny.getAndIncrement();
            try {
                tasma1.put(bufor);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(getName()+"-wytloczyl obudowe i nadal nr seryjny "+bufor+", umieszcza na tasmie\n");
        }
    }
}
