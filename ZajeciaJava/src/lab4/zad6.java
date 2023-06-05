package lab4;

public class zad6 {
    public zad6(){
        char[] tab=new char[26];
        int counter=0;
        System.out.print("|");

        for(char i='a';i<='z';i++){
            tab[counter]=i;
            System.out.print(tab[counter]+"|");
            counter++;
        }
        System.out.print("\nDlugosc tablicy: "+tab.length);

    }
}
