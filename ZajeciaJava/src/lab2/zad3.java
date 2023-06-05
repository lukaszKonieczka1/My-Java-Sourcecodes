package lab2;
import java.util.Scanner;

public class zad3 {
    public zad3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj predkosc w milach");
        double speed=sc.nextDouble();
        System.out.printf("Podana predkosc w km wynosi %.1f km/h",speed*1.6);

    }
}
