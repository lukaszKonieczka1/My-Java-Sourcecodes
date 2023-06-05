package lab5;

public class coffeExpress_interface{

    coffeExpress_API control =new coffeExpress_API();
    public coffeExpress_interface() throws InterruptedException {
        control.threadStart();
        while(control.end){
            control.expressDraw();
            control.status();
        }
    }
}


