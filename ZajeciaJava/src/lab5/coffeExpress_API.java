package lab5;

import cls.clear;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class coffeExpress_API {
    Scanner sc=new Scanner(System.in);
    Scanner sp=new Scanner(System.in);
    Random rand=new Random();
    //---------------------------------------------------------------------------------------------
    //Constants responsible for color of some characters
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK = "\033[0;30m"; // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";   // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String WHITE = "\033[0;37m";   // WHITE
    //---------------------------------------------------------------------------------------------
    //LED Lights
    String expressLed =RED+"#"+RESET;
    String waterHeaterLed=RED+"#"+RESET;
    String milkHeaterLed=RED+"#"+RESET;
    String milkPumpLed=RED+"#"+RESET;
    String waterPumpLed=RED+"#"+RESET;
    String cleanMeLed=RED+"#"+RESET;
    String grinderLed=RED+"#"+RESET;
    //---------------------------------------------------------------------------------------------
    //Coffee Express components
    heater waterHeater=new heater(88);
    heater milkHeater=new heater(65);
    pump waterPump=new pump();
    pump milkPump=new pump();
    storageContainer waterStorage=new storageContainer(1800,1800);
    storageContainer milkStorage=new storageContainer(1000,1000);
    storageContainer coffeeStorage=new storageContainer(250,250);
    storageContainer groundCoffeeStorage=new storageContainer(20,0);
    storageContainer sugarStorage=new storageContainer(50,50);
    storageContainer wasteStorage=new storageContainer(125,0);
    List<storageContainer> containers= Arrays.asList(waterStorage,milkStorage,coffeeStorage,groundCoffeeStorage,wasteStorage,sugarStorage);
    //---------------------------------------------------------------------------------------------
    //Variables used by interface
    String msg="\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0";
    String msg2="\u00A0";
    String coffeCup1="|     |$";
    String coffeCup2="|     |$";
    String coffeCup3="-----";
    String click="_";
    String prompt="off";
    String[] helper2={"","\b\b","\b\b","","\b\b",""};
    String helper=helper2[0];
    String helper3="";
    String liquid="";
    String waterHose=BLACK+"#############"+RESET;
    String milkHose=BLACK+"#############"+RESET;
    String space="";
    //Coffee
    String[] coffee={"\b\b1.Capuccino","\b2.Espresso","3.Latte","\b\b4.Americano","5.Lungo"};
    int swipe=0;
    List<String> fillLevel=Arrays.asList("","","","","","");
    //---------------------------------------------------------------------------------------------
    //Variables used to control express actions
    int[][] recipes={
            {15,0,30,25,15},
            {0,1,0,1,1}
    };
    int sugarLevel=4;
    boolean end=true;
    boolean isOn=false;
    boolean isMade=false;
    boolean isEmpty=false;
    //---------------------------------------------------------------------------------------------
    //Threads responsible for many actions, such as controlling LED lights or printing various
    // messages
    Thread drawing = new Thread(() ->{
        while(true){
                clear.cls();
                expressDraw();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }  );
    Thread message = new Thread(() ->{
        while(true) {
            helper = "\b\b";
            msg = "Grinding.";

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            helper = "\b\b\b";
            msg = "Grinding..";

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            helper = "\b\b\b\b";
            msg = "Grinding...";

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }  );
    Thread message2 = new Thread(() ->{
        while(true){
                helper="\u00A0";
                msg="Making";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                msg="Coffee";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }





    }  );
    Thread waterHeat = new Thread(() ->{
        while(true){
           while(waterHeater.getTemp()<88){
               if(waterHeater.getTemp()<=21) {
                   waterHeaterLed = YELLOW + "#" + RESET;
               }else{
               waterHeaterLed=GREEN+"#"+RESET;
               }
               if(waterHeater.getTemp()>=80){
                   waterHeater.setTemp(88);
               }
                    waterHeater.setTemp(waterHeater.getTemp()+ rand.nextInt(20-10)+10);

                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
    }  );
    Thread milkHeat = new Thread(() ->{
        while(true) {
            while (milkHeater.getTemp() < 65) {
                if (milkHeater.getTemp() <= 16) {
                    milkHeaterLed = YELLOW + "#" + RESET;
                } else {
                    milkHeaterLed = GREEN + "#" + RESET;
                }
                if (milkHeater.getTemp() >= 60) {
                    milkHeater.setTemp(65);
                }
                milkHeater.setTemp(milkHeater.getTemp() + rand.nextInt(15 - 1) + 1);

                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }  );
    Thread waterPumping = new Thread(() ->{
        while(true){
                waterPumpLed=YELLOW+"#"+RESET;
                waterHose=BLUE+"#############"+RESET;
                for(int i=0;i<25;i++){
                    switch(i){
                        case 10->{liquid=YELLOW+"#"+RESET; coffeCup1="|  "+YELLOW+"#"+RESET+"\u00A0\u00A0|$"; space="\b";}
                        case 12->coffeCup2="|"+YELLOW+"_____"+RESET+"|$";
                        case 16->coffeCup2="|"+YELLOW+"-----"+RESET+"|$";
                        case 20->coffeCup2="|"+YELLOW+"#####"+RESET+"|$";
                        case 23->{liquid=""; coffeCup1="|\u00A0\u00A0\u00A0\u00A0\u00A0|$"; space="";}
                    }
                    waterStorage.setFillLevel(waterStorage.getFillLevel()-1);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }




    }  );
    Thread milkPumping = new Thread(() ->{
        while(true){
                milkPumpLed=YELLOW+"#"+RESET;
                if(recipes[1][swipe]==0){
                    milkHose=WHITE+"#############"+RESET;
                    milkStorage.setFillLevel(milkStorage.getFillLevel()-recipes[0][swipe]);
                    for(int i=0;i<25;i++){
                        switch(i){
                            case 10->{liquid=WHITE+"#"+RESET; space="\b";}
                            case 12->coffeCup1="|"+WHITE+"_____"+RESET+"|$";
                            case 16->coffeCup1="|"+WHITE+"-----"+RESET+"|$";
                            case 20->coffeCup1="|"+WHITE+"#####"+RESET+"|$";
                            case 23->{liquid=""; space="";}
                        }
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }else if(recipes[1][swipe]==1){
                    waterHose=BLUE+"#############"+RESET;
                    waterStorage.setFillLevel(waterStorage.getFillLevel()-recipes[0][swipe]);
                    for(int i=0;i<25;i++){
                        switch(i){
                            case 10->{liquid=BLUE+"#"+RESET; space="\b";}
                            case 12->coffeCup1="|"+BLUE+"_____"+RESET+"|$";
                            case 16->coffeCup1="|"+BLUE+"-----"+RESET+"|$";
                            case 20->coffeCup1="|"+BLUE+"#####"+RESET+"|$";
                            case 23->{liquid=""; space="";}
                        }
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            }
    }  );

    public void threadStart(){
        drawing.start();
        drawing.suspend();
        message.start();
        message.suspend();
        message2.start();
        message2.suspend();
        waterHeat.start();
        waterHeat.suspend();
        milkHeat.start();
        milkHeat.suspend();
        waterPumping.start();
        waterPumping.suspend();
        milkPumping.start();
        milkPumping.suspend();
    }
    //---------------------------------------------------------------------------------------------
    //Function responsible for drawing express interface
    public void expressDraw(){
        //---------------------------------------------------------------------------------------------
        //This loop manages positioning of fill level printed values
        for(int i=0;i<6;i++){
            if(String.valueOf(containers.get(i).getFillLevel()).length()<4){
                String help="";
                for(int j=0;j<(4-String.valueOf(containers.get(i).getFillLevel()).length());j++){
                    help+="\u00A0";
                    fillLevel.set(i,help);
                }
            }else{
                fillLevel.set(i,"");
            }
        }
        //---------------------------------------------------------------------------------------------
        System.out.print(
                "---------------------------------------------------------------------------------------------------\n"+
                        "|                     |  |                |"+waterHose+"|   LED Indicators   |     Fill Level     |\n"+
                        "| ------------------- |  |                |-------------|   Water heater "+waterHeaterLed+"   | Water        "+fillLevel.get(0)+waterStorage.getFillLevel()+"  |\n"+
                        "| |                 | |  |                |"+milkHose+"|--------------------|--------------------|\n"+
                        "| |     "+msg+"     "+helper+"| |  |                |-------------|   Milk heater  "+milkHeaterLed+"   | Milk         "+fillLevel.get(1)+milkStorage.getFillLevel()+"  |\n"+
                        "| |     "+msg2+"           "+helper3+"| |  ------------------             |--------------------|--------------------|\n"+
                        "| |                 | |          |_|                    |   Water pump   "+waterPumpLed+"   | Coffee       "+fillLevel.get(2)+coffeeStorage.getFillLevel()+"  |\n"+
                        "| ------------------- |           "+liquid+"                      "+space+"|--------------------|--------------------|\n"+
                        "|                     |        "+coffeCup1+"                 |   Milk pump    "+milkPumpLed+"   | Ground coffee"+fillLevel.get(3)+groundCoffeeStorage.getFillLevel()+"  |\n"+
                        "|   on       LED      |        "+coffeCup2+"                 |--------------------|--------------------|\n"+
                        "|   |"+click+"|       "+ expressLed +"       |         "+coffeCup3+"                   |   Clean Me     "+cleanMeLed+"   | Waste        "+fillLevel.get(4)+wasteStorage.getFillLevel()+"  |\n"+
                        "|   off               |      -----------                |--------------------|--------------------|\n"+
                        "|                     |                                 |   Grinder      "+grinderLed+"   | Sugar        "+fillLevel.get(5)+sugarStorage.getFillLevel()+"  |\n" +
                        "---------------------------------------------------------------------------------------------------\n"+
                        waterHeater.getTemp()+" "+milkHeater.getTemp()+" "+waterHeat.isAlive()+" "+milkHeat.isAlive()+"\040\n");
    }
    //---------------------------------------------------------------------------------------------
    //Function responsible for printing status of the express, taking the input from user and giving it to the
    //controller
    public void status() throws InterruptedException {
        switch(prompt.toLowerCase()){
            case "off"->System.out.print("Wpisz ON aby wlaczyc lub OFF aby wylaczyc. Obecnie ekspres jest w stanie "+prompt+"\n");
            case "on","forward","back","make"->{
                if(!isOn){
                    System.out.print("Wpisz ON aby wlaczyc lub OFF aby wylaczyc. Obecnie ekspres jest w stanie OFF\n");
                    break;
                }
                if(isMade){
                    System.out.print("Wyciagnij kubek. Wpisz HELP aby wyswietlic komendy.\n");
                    break;
                }
                if(isEmpty){
                    System.out.print("Wloz nowy kubek. Wpisz HELP aby wyswietlic komendy.\n");
                    break;
                }
                System.out.print("Ekspres jest w stanie "+prompt+". Wpisz OFF aby wylaczyc lub podaj inna komende, dostepne sa po wpisaniu polecenia HELP.\nWybrana zostala pozycja nr "+(swipe+1)+"\n");
            }
            case "help"->System.out.print("LISTA KOMEND:\nON - wlaczenie ekspresu\nOFF - wylaczenie ekspresu\nFORWARD - przesuniecie ekranu do przodu\nBACK - przesuniecie ekranu do tylu\nMAKE - zrobienie wybranej kawy\nTAKE - wziecie pelnego kubka\nCUP - wlozenie pustego kubka\nEXIT - wyjscie z programu\n");
            default->System.out.print("Bledna komenda. Wpisz HELP aby wyswietlic komendy.\n");
        }
        System.out.print("Podaj komende: ");
        prompt=sc.nextLine();
        controller(prompt.toLowerCase());
    }
    //---------------------------------------------------------------------------------------------
    //Function responsible for controlling the entire express actions
    public void controller(String prompt) throws InterruptedException {
        switch(prompt){
            case "on"->{
                clear.cls();
                isOn=true;
                msg="Welcome";
                expressLed =GREEN+"#"+RESET;
                click="^";
                expressDraw();
                Thread.sleep(1000);
                msg=coffee[swipe];
                helper=helper2[1];
                clear.cls();
            }
            case "off"->{
                clear.cls();
                isOn=false;
                helper=helper2[0];
                click="_";
                msg="See you";
                expressDraw();
                Thread.sleep(1000);
                expressLed =RED+"#"+RESET;
                msg="\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0";
                clear.cls();
            }
            case "forward"->{
                if(!isOn){
                    clear.cls();
                    break;
                }
                if(swipe==4){
                    swipe=0;

                }else{
                    swipe++;
                }
                msg=coffee[swipe];
                helper=helper2[swipe+1];
                clear.cls();

            }
            case "back"->{
                if(!isOn){
                    clear.cls();
                    break;
                }
                if(swipe==0){
                    swipe=4;
                    msg=coffee[swipe];
                    helper=helper2[swipe-1];
                }else{
                    swipe--;
                    msg=coffee[swipe];
                    helper=helper2[swipe+1];
                }
                clear.cls();
            }
            case "make"->{
                if(!isOn||isMade||isEmpty){
                    clear.cls();
                    break;
                }
                //Grinding coffee
                coffeeStorage.setFillLevel(coffeeStorage.getFillLevel()-7);
                groundCoffeeStorage.setFillLevel(7);
                grinderLed=GREEN+"#"+RESET;
                drawing.resume();
                message.resume();
                waterHeat.resume();
                milkHeat.resume();
                Thread.sleep(12000);
                clear.cls();
                grinderLed=RED+"#"+RESET;
                drawing.suspend();
                message.suspend();
                waterHeat.suspend();
                milkHeat.suspend();
                helper="\u00a0\u00a0";
                msg="\u00a0Done";
                expressDraw();
                Thread.sleep(1000);
                //How much sugar do you want
                while(sugarLevel<0 || sugarLevel>3){
                    clear.cls();
                    expressDraw();
                    System.out.print("\nPodaj ilosc cukru (0-3):");
                    sugarLevel=sp.nextInt();
                }
                sugarStorage.setFillLevel(sugarStorage.getFillLevel()-(5*sugarLevel));
                //Making coffee
                waterPump.setPressure(9);
                milkPump.setPressure(9);
                drawing.resume();
                message2.resume();
                waterPumping.resume();
                Thread.sleep(7200);
                waterPumping.suspend();
                wasteStorage.setFillLevel(wasteStorage.getFillLevel()+groundCoffeeStorage.getFillLevel());
                groundCoffeeStorage.setFillLevel(0);
                waterHose=BLACK+"#############"+RESET;
                waterPumpLed=RED+"#"+RESET;
                if(swipe!=1){
                    milkPumping.resume();
                    Thread.sleep(7200);
                    milkPumping.suspend();
                    milkHose=BLACK+"#############"+RESET;
                    waterHose=BLACK+"#############"+RESET;
                }
                if(swipe==1){
                    coffeCup1="|\u00A0\u00A0\u00A0\u00A0\u00A0|$";
                }
                milkPumpLed=RED+"#"+RESET;
                drawing.suspend();
                message2.suspend();
                clear.cls();
                helper="\b";
                liquid="";
                space="";
                msg="\b\bEnjoy your";
                helper3="\b\b\b\b\b";
                msg2="Coffee";
                expressDraw();
                Thread.sleep(1500);
                msg=coffee[swipe];
                msg2="";
                helper3="\u00A0";
                helper=helper2[swipe+1];
                sugarLevel=4;
                isMade=true;
                waterHeater.setTemp(0);
                milkHeater.setTemp(0);
                waterPump.setPressure(0);
                milkPump.setPressure(0);
                waterHeaterLed=RED+"#"+RESET;
                milkHeaterLed=RED+"#"+RESET;
                clear.cls();
            }
            case "take"->{
                clear.cls();
                    coffeCup1="\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0";
                    coffeCup2="\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0";
                    coffeCup3="\u00A0\u00A0\u00A0\u00A0\u00A0";
                    isMade=false;
                    isEmpty=true;
            }
            case "cup"->{
                clear.cls();
                if(!isMade){
                    coffeCup1="|     |$";
                    coffeCup2="|     |$";
                    coffeCup3="-----";
                    isEmpty=false;
                }
            }
            case "exit"->{
                clear.cls();
                System.out.print("See you again!\n");
                Thread.sleep(1000);
                end=false;
            }
            default -> clear.cls();
        }
    }
}