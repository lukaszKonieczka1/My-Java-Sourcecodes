package lab4;

public class zad4 {
    public zad4(){
        int[][] mt=new int[15][15];
        int[] avgmt=new int[15];
        System.out.print("-------------------------------------------------------------\n");
        for(int x=0;x<15;x++){
            System.out.print("|");
            for(int y=0;y<15;y++){
                mt[x][y]=(x+1)*(y+1);
                if(mt[x][y]>0 && mt[x][y]<10){
                    System.out.print("00"+mt[x][y]+"|");
                }else if(mt[x][y]>=10 && mt[x][y]<100){
                    System.out.print("0"+mt[x][y]+"|");
                }else
                    System.out.print(mt[x][y]+"|");
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------------------------------------------\n");

        for(int x=0;x<15;x++){
            for(int y=0;y<15;y++){
                avgmt[x]+=mt[y][x];

            }
            System.out.print(avgmt[x]/mt[x].length+"|");
        }

    }
}
