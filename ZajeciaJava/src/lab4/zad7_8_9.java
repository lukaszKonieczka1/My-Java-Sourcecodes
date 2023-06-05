package lab4;

public class zad7_8_9 {
    public zad7_8_9(){
        zad7 x=new zad7();
        zad8 y=new zad8();
        zad9 z=new zad9();
        System.out.print("--------------\n| Zadanie 7  |\n");
        int[][] zad7=x.zadanie7();
        System.out.print("\n\n--------------\n| Zadanie 8  |\n");
        int[][] zad8=y.zadanie8(zad7);
        System.out.print("\n\n--------------\n| Zadanie 9  |\n");
        System.out.print("--------------\n|Bubble  sort|\n");
        z.bubblesort(zad8);
        System.out.print("--------------\n| Quick sort |\n");
        z.quicksort(zad8);

    }
}
