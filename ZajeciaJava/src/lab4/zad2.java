package lab4;

import java.util.Random;

public class zad2{
    Random rand=new Random();
    public zad2(){
        int[][] tablica1=new int[7][7],tablica2=new int[7][7];
        System.out.print("___________________________________________\n  Wylosowane liczby:\n----------------------\n");
        for(int i=0;i<7;i++) {
            if(i!=0)
                System.out.print("\n");
            System.out.print("|");
            for(int y = 0; y < 7; y++) {
                tablica1[i][y]=rand.nextInt(99-10)+10;
                System.out.print(tablica1[i][y]+"|");
            }
        }

        System.out.print("\n----------------------");

        System.out.print("\n___________________________________________\n");

        for(int i=0;i<7;i++){
            System.out.print("Najmniejsza w "+(i+1)+" kolumnie: "+ lowestInColumn(tablica1,i)+"\n");
        }
        System.out.print("___________________________________________\n");
        for(int i=0;i<7;i++){
            System.out.print("Najwieksza w "+(i+1)+" kolumnie: "+ highestInColumn(tablica1,i)+"\n");
        }

        System.out.print("___________________________________________\nNajmniejsza: "+lowest(tablica1)+"\nNajwieksza: "+highest(tablica1)+
                "\nSrednia arytmetyczna: "+avg(tablica1)+"\nIlosc elementow mniejszych od sredniej: "
                +highOrLow(tablica1,avg(tablica1),false)+"\nIlosc elementow wiekszych od sredniej: "
                +highOrLow(tablica1,avg(tablica1),true)+"\n___________________________________________\n");

        System.out.print("\nOdwrocona tablica:\n----------------------\n");

        for(int i=0;i<7;i++) {
            if(i!=0)
                System.out.print("\n");
            System.out.print("|");
            for(int y = 0; y < 7; y++) {
                tablica2[i][y]=tablica1[(tablica1.length-1)-i][(tablica1.length-1)-y];
                System.out.print(tablica2[i][y]+"|");
            }
        }
        System.out.print("\n___________________________________________");
    }

    public int lowestInColumn(int[][] tabb,int index){
        int lowest=tabb[0][index];
        for(int i=0;i<7;i++){
            if(tabb[i][index]<lowest)
                lowest=tabb[i][index];
        }

        return lowest;
    }

    public int highestInColumn(int[][] tabbb,int index){
        int highest=tabbb[0][index];
        for(int i=0;i<7;i++){
            if(tabbb[i][index]>highest)
                highest=tabbb[i][index];
        }

        return highest;
    }

    public int lowest(int[][] nums){
        int small=nums[0][0];
        for(int i=0;i<7;i++){
            for(int y=0;y<7;y++){
                if(nums[i][y]<small)
                    small=nums[i][y];
            }
        }
        return small;
    }

    public int highest(int[][] nums){
        int big=nums[0][0];
        for(int i=0;i<7;i++){
            for(int y=0;y<7;y++){
                if(nums[i][y]>big)
                    big=nums[i][y];
            }
        }
        return big;
    }

    public int avg(int[][] nums){
        int avg=0;
        for(int i=0;i<7;i++){
            for(int y=0;y<7;y++){
                avg+=nums[i][y];
            }
        }
        return avg/49;
    }

    public int highOrLow(int[][] nums,int avg, boolean check){
        int counter=0;
        for(int i=0;i<7;i++){
            for(int y=0;y<7;y++){
                if(check){
                    if(nums[i][y]>avg)
                        counter++;
                }else{
                    if(nums[i][y]<avg)
                        counter++;
                }

            }
        }
        return counter;
    }





}



