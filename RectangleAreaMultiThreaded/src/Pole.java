import java.util.concurrent.Semaphore;

public class Pole extends Thread{
    Semaphore sem1,sem2,sem3;
    BokA bok1;
    BokB bok2;

    public Pole(Semaphore sem1, Semaphore sem2, Semaphore sem3, BokA bok1, BokB bok2){
        this.sem1=sem1;
        this.sem2=sem2;
        this.sem3=sem3;
        this.bok1=bok1;
        this.bok2=bok2;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try {
                sem3.acquire(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("Watek Pole-pobralem dane z BokA i z BokB, liczby "+bok1.getBokA()+" oraz "+bok2.getBokB()+"\nWatek Pole-Obliczone pole="+bok1.getBokA()*bok2.getBokB()+" -pole nr "+(i+1)+"\n\n");
            sem1.release();
            sem2.release();
        }
    }
}
