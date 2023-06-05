package lab4;

import java.util.Random;

public class zad5 {
    public zad5(){
        int[] tab=new int[40];
        Random rand=new Random();

        System.out.print("|");
        for(int i=0;i<40;i++){
            if(i<=10){
                tab[i]=rand.nextInt(5-1)+1;
            }else if(i<=20){
                tab[i]=rand.nextInt(10-6)+6;
            }else if(i<=30){
                tab[i]=rand.nextInt(55-11)+11;
            }else {
                tab[i]=rand.nextInt(75-60)+60;
            }
            System.out.print(tab[i]+"|");
        }
    }
}
