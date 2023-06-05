package lab2;

import java.util.Scanner;

public class zad6 {
    public zad6(){

        Scanner sc=new Scanner(System.in);
        double kwota=0,wklad=0,wynik;
        int raty=0;

        while(kwota<1||kwota>300000){
            System.out.println("Wpisz kwote");
            kwota=sc.nextDouble();
        }

        while(wklad<1||wklad>kwota*0.45){
            System.out.println("Wpisz wklad wlasny");
            wklad=sc.nextDouble();
        }

        while(raty<1||raty>96){
            System.out.println("Podaj ilosc rat");
            raty=sc.nextInt();
        }

        if(raty<=24){

            wynik=((kwota-wklad)/raty);
            wynik=wynik+(wynik*0.2);

        }else if(raty<=48){

            wynik=((kwota-wklad)/raty);
            wynik=wynik+(wynik*0.3);

        }else if(raty<=60){

            wynik=((kwota-wklad)/raty);
            wynik=wynik+(wynik*0.4);

        }else if(raty<=72){

            wynik=((kwota-wklad)/raty);
            wynik=wynik+(wynik*0.5);

        }else{

            wynik=((kwota-wklad)/raty);
            wynik=wynik+(wynik*0.6);

        }

        System.out.println("------------------------------------------");
        System.out.println("Kwota wynosi: "+wynik);


    }

}
