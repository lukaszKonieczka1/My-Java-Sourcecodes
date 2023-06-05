package lab4;

import java.util.Random;

public class zad8{


    public int[][] tab2_fill(){
        Random rand=new Random();
        int[][] tab2=new int[12][12];

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                tab2[i][j]=rand.nextInt(10-1)+1;
            }

        }

        return tab2;
    }

    public int[][] zadanie8(int[][] zad7){

        int[][] tab2=tab2_fill();

        System.out.print("--------------\n|   Macierz  |\n|Wygenerowana|\n");
        System.out.print("-------------------------------------\n");
        for(int i=0;i<12;i++){
            System.out.print("|");
            for(int j=0;j<12;j++){
                //tab2[i][j]=tab2[i][j]+zad7[i][j];
                if(tab2[i][j]<10)
                    System.out.print("0");
                System.out.print(tab2[i][j]+"|");
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------------------\n");
        System.out.print("--------------\n|    Suma    |\n|  Macierzy  |\n");
        System.out.print("-------------------------------------\n");
        for(int i=0;i<12;i++){
            System.out.print("|");
            for(int j=0;j<12;j++){
                tab2[i][j]=tab2[i][j]+zad7[i][j];
                if(tab2[i][j]<10)
                    System.out.print("0");
                System.out.print(tab2[i][j]+"|");
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------------------\n");

        return tab2;
    }

}