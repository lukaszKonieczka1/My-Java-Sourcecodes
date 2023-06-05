package lab2;
import java.util.Scanner;

public class zad2 {
    public zad2(){
        Scanner sc=new Scanner(System.in);
        int[] param=new int[3];
        for(int i=1;i<=3;i++){
            System.out.print(i+" element:");
            param[i-1]=sc.nextInt();
        }
        System.out.println(param[0]+"x^2+"+param[1]+"x+"+param[2]+"=0");
        double delta=Math.pow(param[1],2)-(4*param[0]*param[2]);
        if(delta==0){
            System.out.println("x="+(-param[1]/(2*param[0])));
        }else if(delta>0){
            delta=Math.sqrt(delta);
            System.out.println("x1="+((-param[1]-delta)/(2*param[0]))+" x2="+((-param[1]+delta)/(2*param[0])));
        }else{
            System.out.println("Ujemna delta, brak rozwiazan");
        }

    }
}
