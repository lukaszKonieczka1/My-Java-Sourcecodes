package lab3;
import java.util.ArrayList;
import java.util.Scanner;

public class zad4 {
    public zad4(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
        int num=0;
        System.out.print("Wpisuj kolejne liczby, dopoki nie wpiszesz 5 kontynuowane bedzie ich dodawanie. Po wpisaniu 5 wyswietlony zostanie iloczyn podanych liczb\n");

        while(num!=5){
            System.out.print("Podana liczba: ");
            num=sc.nextInt();
            nums.add(num);
        }

        num=nums.get(0);

        for(int i=1;i<nums.size()-1;i++){
            num=num*nums.get(i);
        }

        System.out.print("Iloczyn podanych liczb wynosi "+ num);
    }
}
