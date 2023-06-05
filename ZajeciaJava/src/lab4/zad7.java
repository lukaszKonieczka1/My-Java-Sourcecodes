package lab4;

import java.util.Random;

public class zad7 {

    int[][] tab_nums=new int[12][12];
    public int[][] tab_fill(int[][] tab){
        Random rand=new Random();
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                if(i==j)
                    tab[i][j]=i;
                else
                    tab[i][j]=rand.nextInt(10-1)+1;
            }

        }
        return tab;
    }

    public int[][] zadanie7(){
        int[][] tab=tab_fill(tab_nums);
        System.out.print("-------------------------------------\n");

        for(int i=0;i<12;i++){
            System.out.print("|");
            for(int j=0;j<12;j++){
                if(tab[i][j]<10)
                    System.out.print("0");
                System.out.print(tab[i][j]+"|");
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------------------\n");
        return tab;
    }





}
