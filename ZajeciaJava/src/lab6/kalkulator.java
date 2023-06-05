package lab6;

public class kalkulator {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int wynik;
    public static int[] tab=new int[8];

    public kalkulator(int a, int method){
        cls.clear.cls();
        this.a=a;
        switch (method){
            case 1->zad1.setWynik(a+a);
            case 2->zad1.setWynik(0);
            case 3->zad1.setWynik(a*a);
            case 4->{
                if(a==0)
                    System.out.print("Nie mozna dzielic przez 0");
                else
                    zad1.setWynik(1);
            }
        }
        this.wynik=zad1.getWynik();
        setAllFields();
        }

    public kalkulator(int a, int b, int c, int d, int method){
        cls.clear.cls();
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        switch (method){
            case 1->zad1.setWynik(a+b+c+d);
            case 2->zad1.setWynik(a-b-c-d);
            case 3->zad1.setWynik(a*b*c*d);
            case 4->{
                if(b==0||c==0||d==0)
                    System.out.print("Nie mozna dzielic przez 0");
                else
                    zad1.setWynik(a/b/c/d);
            }
        }
        this.wynik=zad1.getWynik();
        setAllFields();
    }

    public kalkulator(int a, int b, int c, int d, int e, int f, int g, int method){
        cls.clear.cls();
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
        this.g=g;
        switch (method){
            case 1->zad1.setWynik(a+b+c+d+e+f+g);
            case 2->zad1.setWynik(a-b-c-d-e-f-g);
            case 3->zad1.setWynik(a*b*c*d*e*f*g);
            case 4->{
                if(b==0||c==0||d==0||e==0||f==0||g==0)
                    System.out.print("Nie mozna dzielic przez 0");
                else
                    zad1.setWynik(a/b/c/d/e/f/g);
            }
        }
        this.wynik=zad1.getWynik();
        setAllFields();
    }

    public kalkulator(kalkulator calc){
        a=calc.a;
        b=calc.b;
        c=calc.c;
        d=calc.d;
        e=calc.e;
        f=calc.f;
        g=calc.g;
        wynik=calc.wynik;
    }

    public void setAllFields(){
        tab[0]=this.a;
        tab[1]=this.b;
        tab[2]=this.c;
        tab[3]=this.d;
        tab[4]=this.e;
        tab[5]=this.f;
        tab[6]=this.g;
        tab[7]=this.wynik;
    }
}
