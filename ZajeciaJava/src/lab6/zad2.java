package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class zad2 {
    public zad2(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

    }
}


