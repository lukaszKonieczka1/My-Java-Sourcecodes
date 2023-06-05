package lab2;
import java.util.Scanner;

public class zad5 {
    public zad5(){
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0;
        while(c==0){
            System.out.println("Kalkulator\n1.Podaj liczby\n2.Dodawanie\n3.Odejmowanie\n4.Mnozenie\n5.Dzielenie\n6.Wyjscie");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Podaj liczby:");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    break;
                case 2:
                    System.out.println(a+b);
                    break;
                case 3:
                    System.out.println(a-b);
                    break;
                case 4:
                    System.out.println(a*b);
                    break;
                case 5:
                    if(b>0){
                        System.out.println(a/b);
                    }
                    break;
                case 6:
                    c=1;
                    break;
            }

        }

    }
}
