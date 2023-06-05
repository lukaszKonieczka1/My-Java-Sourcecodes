package lab3;

import java.util.Scanner;

public class zad1 {
    public zad1(){
        Scanner sc=new Scanner(System.in);
        int licznikparz=0,liczniknparz=0,parz=0,nparz=0;
        float avgparz=0,avgnparz=0;
        String isprime="tak";
        System.out.println("Podaj liczbe");
        String liczba=sc.nextLine();
        for(int i=0;i<liczba.length();i++){
            if(liczba.charAt(i)%2==0){
                licznikparz++;
                parz=parz+Character.getNumericValue(liczba.charAt(i));
            }else{
                liczniknparz++;
                nparz=nparz+Character.getNumericValue(liczba.charAt(i));
            }
        }
        if(licznikparz>0) avgparz=parz/licznikparz;
        if(liczniknparz>0) avgnparz=nparz/liczniknparz;

        int num=Integer.parseInt(liczba);

        if(num<=1){
            isprime="nie";
        }
        for(int i=2;i<=num/2;i++){
            if ((num % i == 0)) {
                isprime = "nie";
                break;
            }
        }

        System.out.println("Srednia liczb parzystych: "+avgparz+"\nSrednia liczb nieparzystych: "+avgnparz+"\nStosunek liczb parzystych do nieparzystych: "+licznikparz+":"+liczniknparz+"\nCzy podana liczba jest pierwsza: "+isprime);
    }
}
