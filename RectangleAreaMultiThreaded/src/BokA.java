import java.util.Random;
import java.util.concurrent.Semaphore;

public class BokA extends Thread{
    Semaphore sem1, sem3;
    int bokA;
    Random rand=new Random();
    public BokA(Semaphore sem1, Semaphore sem3){
        this.sem1=sem1;
        this.sem3=sem3;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            setBokA(rand.nextInt(100-1)+1);
            System.out.print("Watek BlokA-Wylosowano bok A="+getBokA()+" -losowanie nr "+(i+1)+"\n");
            sem3.release();
            try {
                sem1.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
