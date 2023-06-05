package lab5;

public class AutoKomis {
    public AutoKomis(){
        samochod[] auta=new samochod[10];
//-----------------------------------------------------
        auta[0]=new samochod("Toyota","Corolla","1.6","Hatchback","VVTI 110KM","2005","13500",2006,5,13);
        auta[1]=new samochod("Skoda","Superb","2.0","Sedan","TDI 150KM","2021","163500",2021,7,24);
        auta[2]=new samochod("Volkswagen","Passat B5","1.9","Kombi","TDI 90KM","1999","4500",2001,3,8);
        auta[3]=new samochod("Daewoo","Lanos","1.5","Kompakt","98KM","1999","2900",2000,7,23);
        auta[4]=new samochod("Renault","Clio","1.2","Hatchback","118KM","2018","45900",2018,10,19);
        auta[5]=new samochod("Mazda","3","2.0","Sedan","122KM","2019","89900",2019,4,3);
        auta[6]=new samochod("Fiat","Punto","1.2","Hatchback","69KM","2013","17900",2014,2,17);
        auta[7]=new samochod("Ford","Focus","1.6","Kombi","150KM ","2011","19900",2011,9,4);
        auta[8]=new samochod("Toyota","RAV4","2.0","SUV","173KM","2022","172700",2022,10,27);
        auta[9]=new samochod("BMW","E46","1.9","Sedan","89KM","1999","11200",2002,12,22);
//-----------------------------------------------------

        for(int i=0;i<auta.length;i++){
            if(i==9)
                System.out.print("--------------\n|   Auto "+(i+1)+"  |\n");
            else
                System.out.print("--------------\n|   Auto "+(i+1)+"   |\n");
            auta[i].getter();
            System.out.print("\n\n");

        }
    }
}
