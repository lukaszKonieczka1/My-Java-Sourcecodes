package lab5;
import java.util.Scanner;

public class containerlab5 {
    public containerlab5(int choose) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        boolean set=true;
        while(set){
            cls.clear.cls();
            switch(choose){
                case 1->{
                    System.out.print(  "---------------\n|Zadanie 1,2,3|\n---------------\n");
                    new AutoKomis();
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 2->{
                    System.out.print(  "\n---------------\n|  Zadanie 4  |\n---------------\n");
                    System.out.print("Ekspres do kawy\n");
                    System.out.print(  "-Wcisnij dowolny przycisk aby uruchomic ekspres-");
                    sc.nextLine();
                    cls.clear.cls();
                    new coffeExpress_interface();
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }

                case 3->{
                    System.out.print(  "---------------\n|  Zadanie 5  |\n---------------\n");
                    new zad5();
                    System.out.print(  "-Wcisnij dowolny przycisk aby kontynuowac-");
                    sc.nextLine();
                    cls.clear.cls();
                    set=false;
                }
                case 4->set=false;
            }
        }
    }
}
