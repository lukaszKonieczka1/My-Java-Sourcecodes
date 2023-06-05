package lab6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class zad3 {
    public zad3() throws IOException {
        new zad1();
        int[] tab=kalkulator.tab;
        FileWriter fileWriter = new FileWriter(".\\kalkulator.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for(int i=0;i<8;i++){
            if(i==7)
                printWriter.print("wynik: "+tab[i]+"\n");
            else
                printWriter.print(i+" pole: "+tab[i]+"\n");
        }
        printWriter.close();
        System.out.print("\nZawartosc pliku:\n");
        new zad2(".\\kalkulator.txt");
    }
}
