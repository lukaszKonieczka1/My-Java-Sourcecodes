import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem1=new Semaphore(0),sem2=new Semaphore(0),sem3=new Semaphore(0);
        BokA t1=new BokA(sem1, sem3);
        BokB t2=new BokB(sem2,sem3);
        Pole t3=new Pole(sem1,sem2,sem3,t1,t2);
        t1.start();
        t2.start();
        t3.start();
    }
}