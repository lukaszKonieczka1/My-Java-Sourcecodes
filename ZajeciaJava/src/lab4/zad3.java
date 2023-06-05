package lab4;

public class zad3 {
    public zad3(){
        boolean[] tab=new boolean[40];
        System.out.print("|");
        for(int i=0;i<40;i++){
            tab[i]= i % 2 != 0;
            System.out.print(tab[i]+"|");
        }
    }
}
