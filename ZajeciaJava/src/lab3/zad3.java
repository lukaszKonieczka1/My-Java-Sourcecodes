package lab3;
import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public zad3(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int goal=rand.nextInt(200-1)+1,ans;
        System.out.print("Zostala wylosowana liczba, odgadnij ja\n");
        while(true){
            System.out.print("Twoja odpowiedz: ");
            ans=sc.nextInt();
            if(ans<goal)
                System.out.print("Wylosowana liczba jest wieksza\n");
            else if(ans>goal)
                System.out.print("Wylosowana liczba jest mniejsza\n");
            else
                break;
        }
        System.out.print("Odgadles!");

    }
}
