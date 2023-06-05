package lab3;

import java.util.Scanner;

public class zad2 {
    public zad2(){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Podaj liczbe");
        num=sc.nextInt();
        System.out.println("Dzielniki liczby "+num+":");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
