import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> tasma1=new ArrayBlockingQueue<>(12), stol=new ArrayBlockingQueue<>(10);
        AtomicInteger seryjny=new AtomicInteger(1),magazyn=new AtomicInteger(0);
        Wytlaczanie wytlaczanie1=new Wytlaczanie(tasma1,seryjny);
        Wytlaczanie wytlaczanie2=new Wytlaczanie(tasma1,seryjny);
        Wytlaczanie wytlaczanie3=new Wytlaczanie(tasma1,seryjny);
        Chlodzenie chlodzenie1=new Chlodzenie(tasma1,stol,seryjny);
        Wypelnianie wypelnianie1=new Wypelnianie(stol,seryjny,magazyn);
        Wypelnianie wypelnianie2=new Wypelnianie(stol,seryjny,magazyn);

        wytlaczanie1.setName("wytlaczanie1");
        wytlaczanie2.setName("wytlaczanie2");
        wytlaczanie3.setName("wytlaczanie3");
        chlodzenie1.setName("chlodzenie1");
        wypelnianie1.setName("wypelnianie1");
        wypelnianie2.setName("wypelnianie2");

        wytlaczanie1.start();
        wytlaczanie2.start();
        wytlaczanie3.start();
        chlodzenie1.start();
        wypelnianie1.start();
        wypelnianie2.start();
    }
}