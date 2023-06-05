package lab6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class zad1 {
    public static int wynik;
    Scanner sc=new Scanner(System.in);
    Scanner sp=new Scanner(System.in);
    public String extract(String str){
        str=str.replaceAll("[^0-9]", " ");
        str=str.replaceAll(" +",",");
        return str;
    }

    public static void setWynik(int result){
        wynik=result;
    }

    public static int getWynik(){
        return wynik;
    }

    public zad1(){
        int counter=0;
        List<Integer> numList= new ArrayList<>();
        StringBuilder helper = new StringBuilder();
        System.out.print("Podaj liczby. Kazda kolejna oddzielaj spacja. Mozesz wpisac 1, 4 lub 7 liczb. Inne nie beda brane pod uwage.\nWpisz liczby: ");
        String nums=sc.nextLine();
        System.out.print("Podaj dzialanie:\n1.Dodawanie\n2.Odejmowanie\n3.Mnozenie\n4.Dzielenie\nWpisz numer dzialania: ");
        int method=sp.nextInt();
        nums+=",";
        String numsExtracted=extract(nums);
        char[] tab=numsExtracted.toCharArray();

        for (char c : tab) {
            if (c != ',') {
                helper.append(c);
            }
            if (c == ','){
                numList.add(Integer.valueOf(String.valueOf(helper)));
                helper= new StringBuilder();
                counter++;
            }
        }

        if(counter>1&&counter<4){
            for(;counter>1;counter--){
                numList.remove(counter-1);
            }
        }else if(counter>4&&counter<7){
            for(;counter>4;counter--){
                numList.remove(counter-1);
            }
        }else if(counter>7){
            for(;counter>7;counter--){
                numList.remove(counter-1);
            }
        }

        switch(counter){
            case 1->new kalkulator(numList.get(0),method);
            case 4->new kalkulator(numList.get(0),numList.get(1),numList.get(2),numList.get(3),method);
            case 7->new kalkulator(numList.get(0),numList.get(1),numList.get(2),numList.get(3),numList.get(4),numList.get(5),numList.get(6),method);
        }
        System.out.print(getWynik()+"\n");
    }
}
