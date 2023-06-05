package lab2;
import java.util.Scanner;

public class zad1 {
    public zad1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        int h=sc.nextInt();

        for(int i=1; i<=h; i++)
        {
            for(int j=1; j<=h-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

