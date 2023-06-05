import java.util.Random;
import java.util.concurrent.Semaphore;

public class BokB extends Thread{
    Semaphore sem2,sem3;
    int bokB;
    Random rand=new Random();
    public BokB(Semaphore sem2, Semaphore sem3){
        this.sem2=sem2;
        this.sem3=sem3;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            setBokB(rand.nextInt(100-1)+1);
            System.out.print("Watek BlokB-Wylosowano bok B="+getBokB()+" -losowanie nr "+(i+1)+"\n");
            sem3.release();
            try {
                sem2.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
