package cls;

import lab2.containerlab2;
import lab3.containerlab3;
import lab4.containerlab4;
import lab5.containerlab5;
import lab6.containerlab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class draw {
    Scanner sc=new Scanner(System.in);

    public draw() throws InterruptedException, IOException {
        boolean skip=false;
        boolean cont=true;
        int choice=0;
        while(cont){
        System.out.print("""
                ----------------------------------
                | Zadania na laboratorium - MENU |
                ----------------------------------
                |        1.Laboratorium 2        |
                ----------------------------------
                |        2.Laboratorium 3        |
                ----------------------------------
                |        3.Laboratorium 4        |
                ----------------------------------
                |        4.Laboratorium 5        |
                ----------------------------------
                |        5.Laboratorium 6        |
                ----------------------------------
                |     6.Informacje o autorze     |
                ----------------------------------
                |           7.Wyjscie            |
                ----------------------------------
                Podaj numer wybranej opcji:\040""");
        if(!skip)
            choice=sc.nextInt();
        switch (choice) {
            case 1 ->{
                int choose;
                skip=true;
                clear.cls();
                System.out.print("""
                            ----------------------------------
                            |         Wybierz zadanie        |
                            ----------------------------------
                            |           1.Zadanie 1          |
                            ----------------------------------
                            |           2.Zadanie 2          |
                            ----------------------------------
                            |           3.Zadanie 3          |
                            ----------------------------------
                            |           4.Zadanie 4          |
                            ----------------------------------
                            |           5.Zadanie 5          |
                            ----------------------------------
                            |           6.Zadanie 6          |
                            ----------------------------------
                            |            7.Powrot            |
                            ----------------------------------
                            Podaj numer wybranej opcji:\040""");
                choose=sc.nextInt();
                if(choose==7)
                    skip=false;
                new containerlab2(choose);}
            case 2 ->{
                int choose;
                skip=true;
                clear.cls();
                System.out.print("""
                            ----------------------------------
                            |         Wybierz zadanie        |
                            ----------------------------------
                            |           1.Zadanie 1          |
                            ----------------------------------
                            |           2.Zadanie 2          |
                            ----------------------------------
                            |           3.Zadanie 3          |
                            ----------------------------------
                            |           4.Zadanie 4          |
                            ----------------------------------
                            |           5.Zadanie 5          |
                            ----------------------------------
                            |            6.Powrot            |
                            ----------------------------------
                            Podaj numer wybranej opcji:\040""");
                choose=sc.nextInt();
                if(choose==6)
                    skip=false;
                new containerlab3(choose);
            }
            case 3 ->{
                int choose;
                skip=true;
                clear.cls();
                System.out.print("""
                            ----------------------------------
                            |         Wybierz zadanie        |
                            ----------------------------------
                            |           1.Zadanie 1          |
                            ----------------------------------
                            |           2.Zadanie 2          |
                            ----------------------------------
                            |           3.Zadanie 3          |
                            ----------------------------------
                            |           4.Zadanie 4          |
                            ----------------------------------
                            |           5.Zadanie 5          |
                            ----------------------------------
                            |           6.Zadanie 6          |
                            ----------------------------------
                            |         7.Zadanie 7,8,9        |
                            ----------------------------------
                            |            8.Powrot            |
                            ----------------------------------
                            Podaj numer wybranej opcji:\040""");
                choose=sc.nextInt();
                if(choose==8)
                    skip=false;
                new containerlab4(choose);
            }
            case 4 ->{
                int choose;
                skip=true;
                clear.cls();
                System.out.print("""
                            ----------------------------------
                            |         Wybierz zadanie        |
                            ----------------------------------
                            |         1.Zadanie 1,2,3        |
                            ----------------------------------
                            |           2.Zadanie 4          |
                            ----------------------------------
                            |           3.Zadanie 5          |
                            ----------------------------------
                            |            4.Powrot            |
                            ----------------------------------
                            Podaj numer wybranej opcji:\040""");
                choose=sc.nextInt();
                if(choose==4)
                    skip=false;
                new containerlab5(choose);
            }
            case 5 ->{
                int choose;
                skip=true;
                clear.cls();
                System.out.print("""
                            ----------------------------------
                            |         Wybierz zadanie        |
                            ----------------------------------
                            |           1.Zadanie 1          |
                            ----------------------------------
                            |           2.Zadanie 2          |
                            ----------------------------------
                            |           3.Zadanie 3          |
                            ----------------------------------
                            |          4.Zadanie 4,5         |
                            ----------------------------------
                            |            6.Powrot            |
                            ----------------------------------
                            Podaj numer wybranej opcji:\040""");
                choose=sc.nextInt();
                if(choose==6)
                    skip=false;
                new containerlab6(choose);
            }
            case 6 -> {
                clear.cls();
                System.out.print("""
                    ----------------------------------
                    |     Autor: Lukasz Konieczka    |
                    |           Wersja: 7.0          |
                    ----------------------------------
                    """);
                Thread.sleep(3000);
                clear.cls();
            }
            case 7 -> cont=false;
        }
    }

    }


}
