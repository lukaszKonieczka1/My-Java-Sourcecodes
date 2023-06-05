package lab4;

import java.util.Scanner;

public class containerlab4 {
    public containerlab4(int choose){
        Scanner sc=new Scanner(System.in);
        boolean set=true;
        while(set){
            cls.clear.cls();
            switch(choose){
                case 1->{
                    System.out.print(  "---------------\n|  Zadanie 1  |\n---------------\n");
                    new zad1();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }
                case 2->{
                    System.out.print("\n---------------\n|  Zadanie 2  |\n---------------\n");
                    new zad2();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }




                case 3->{
                    System.out.print("\n---------------\n|  Zadanie 3  |\n---------------\n");
                    new zad3();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 4->{
                    System.out.print("\n---------------\n|  Zadanie 4  |\n---------------\n");
                    new zad4();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 5->{
                    System.out.print("\n---------------\n|  Zadanie 5  |\n---------------\n");
                    new zad5();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 6->{
                    System.out.print("\n---------------\n|  Zadanie 6  |\n---------------\n");
                    new zad6();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 7->{
                    System.out.print("\n---------------\n|Zadanie 7,8,9|\n---------------\n");
                    new zad7_8_9();
                    System.out.print(  "\n-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 8->set=false;
            }
        }

    }
}
