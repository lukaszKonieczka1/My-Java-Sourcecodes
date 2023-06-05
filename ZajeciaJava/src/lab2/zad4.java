package lab2;
import java.util.Scanner;

public class zad4 {
    public zad4(){
        Scanner sc=new Scanner(System.in);

        int min,max,ilosc=11;
        double srednia=0;

        while(ilosc>10){
            System.out.println("Podaj ilosc liczb (maksymalnie 10)");
            ilosc=sc.nextInt();
        }

        int[] liczby=new int[10];

        for(int i=0;i<ilosc;i++) {
            System.out.print("Podaj "+(i+1)+" liczbe");
            liczby[i]=sc.nextInt();
        }

        min=liczby[0];
        max=liczby[0];


        for(int i=0;i<ilosc;i++) {
            srednia=srednia+liczby[i];
        }
        srednia=srednia/ilosc;


        for(int i=1;i<ilosc;i++) {
            if(liczby[i]<min){
                min=liczby[i];
            }
        }

        for(int i=1;i<ilosc;i++) {
            if(liczby[i]>max){
                max=liczby[i];
            }
        }

        System.out.print("Ilosc liczb: "+ilosc+"\nMin: "+min+"\nMax: "+max+"\nSrednia: "+srednia);
    }
}
