package lab3;
import java.util.Scanner;

public class zad5 {
    public zad5(){
        Scanner sc=new Scanner(System.in);
        int num=-1,i=0;

        while(num<0){
            System.out.print("Podaj liczbe: ");
            num=sc.nextInt();
        }

        System.out.print("Potegi liczby 3 mniejsze niz podana liczba:\n");

        while(true){
            if(Math.pow(3,i)<num)
                System.out.print("3^"+i+"="+Math.round(Math.pow(3,i))+"\n");
            else
                break;
            i++;
        }
    }
}
