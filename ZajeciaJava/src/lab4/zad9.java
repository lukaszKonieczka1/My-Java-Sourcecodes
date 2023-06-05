package lab4;

public class zad9 {
    //---------------------------------------------------------------------
    //convert two dimensional array to one dimensional array
    //---------------------------------------------------------------------
    public int[] converter(int[][] sorted_tab){
        int counter=0;
        int[] tab=new int[sorted_tab.length*sorted_tab.length];
        for(int i = 0; i<sorted_tab.length; i++){
            for(int j = 0; j<sorted_tab.length; j++){
                   tab[counter]=sorted_tab[i][j];
                   counter++;
                }
            }
        return tab;
    }
    //---------------------------------------------------------------------
    //bubblesort
    //---------------------------------------------------------------------
    public void bubblesort(int[][] sorted){
        int[][] sorted_tab=new int[12][12];
        int temp,counter=0;
        int[] tab=converter(sorted);
        boolean unsorted=true;

        while(unsorted){
            unsorted=false;
                for(int i = 0; i< tab.length-1; i++){
                    if(tab[i]>tab[i+1]){
                        unsorted=true;
                        temp= tab[i+1];
                        tab[i+1]= tab[i];
                        tab[i]=temp;
                    }
                }
                if(counter<5){
                    int count=0;
                    System.out.print("--------------\n|   "+(counter+1)+" Step   |\n");
                    System.out.print("-------------------------------------\n");
                    for(int i=0;i<12;i++){
                        System.out.print("|");
                        for(int j=0;j<12;j++){
                            if(tab[count]<10)
                                System.out.print("0");
                            System.out.print(tab[count]+"|");
                            count++;
                        }
                        System.out.print("\n");
                    }
                    System.out.print("-------------------------------------\n");
                }
                counter++;
            }


        counter=0;
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                sorted_tab[i][j]=tab[counter];
                counter++;

            }
        }
        System.out.print("--------------\n|   Result   |\n");
        System.out.print("-------------------------------------\n");
        for(int i=0;i<12;i++){
            System.out.print("|");
            for(int j=0;j<12;j++){
                if(sorted_tab[i][j]<10)
                    System.out.print("0");
                System.out.print(sorted_tab[i][j]+"|");
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------------------\n");
        System.out.print("--------------------------------------------------------------------------\n");
    }

    //---------------------------------------------------------------------
    //quicksort
    //---------------------------------------------------------------------
    int check=0;
    public int divide(int[] arr, int first, int last){
        int pivot=arr[last];
        int i=(first-1);

        for(int j=first;j<=last-1;j++){
            if(arr[j]<pivot){
                i++;
                int z=arr[i];
                arr[i]=arr[j];
                arr[j]=z;
            }
        }
    int z=arr[i+1];
        arr[i+1]=arr[last];
        arr[last]=z;
        if(check<5){
            int count=0;
            System.out.print("--------------\n|   "+(check+1)+" Step   |\n");
            System.out.print("-------------------------------------\n");
            for(int b=0;b<12;b++){
                System.out.print("|");
                for(int j=0;j<12;j++){
                    if(arr[count]<10)
                        System.out.print("0");
                    System.out.print(arr[count]+"|");
                    count++;
                }
                System.out.print("\n");
            }
            System.out.print("-------------------------------------\n");
            check++;
        }


        return (i+1);
    }

    void quick(int[] arr, int first, int last){
        if(first<last){
            int x=divide(arr, first, last);
            quick(arr, first, x-1);
            quick(arr,x+1,last);
        }
    }

    public void quicksort(int[][] sorted){
        int[] tab=converter(sorted);
        int size=tab.length-1;
        quick(tab, 0, size);
        printArr(tab,size+1);
    }

    void printArr(int[] arr,int n){
        int count=0;
        System.out.print("--------------\n|   Result   |\n");
        System.out.print("-------------------------------------\n");
            for(int i=0;i<12;i++){
                System.out.print("|");
                for(int j=0;j<12;j++){
                    if(arr[count]<10)
                        System.out.print("0");
                    System.out.print(arr[count]+"|");
                    count++;
                }
                System.out.print("\n");
        }
        System.out.print("-------------------------------------\n");
    }
    //---------------------------------------------------------------------
}
