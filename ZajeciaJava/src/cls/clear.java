package cls;

import java.io.IOException;

public class clear {
    public static void cls(){
        try {

            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}
    }

}
