package lab6;

import java.io.IOException;
import java.util.Scanner;

public class containerlab6 {
    public containerlab6(int choose) throws IOException {
        Scanner sc=new Scanner(System.in);
        boolean set=true;
        while(set){
            cls.clear.cls();
            switch(choose){
                case 1->{
                    System.out.print(  "\n---------------\n|  Zadanie 1  |\n---------------\n");
                    new zad1();
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 2->{
                    System.out.print(  "\n---------------\n|  Zadanie 2  |\n---------------\n");
                    new zad2(".\\test.txt");
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }
                case 3->{
                    System.out.print(  "---------------\n|  Zadanie 3  |\n---------------\n");
                    new zad3();
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }
                case 4->{
                    System.out.print(  "---------------\n| Zadanie 4,5 |\n---------------\n");

                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }
                case 5,6->set=false;
            }
        }
    }
}
