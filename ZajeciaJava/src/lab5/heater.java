package lab5;

public class heater {
    int temp=0,range;
    public heater(int range){
        this.range=range;
    }
    public void setTemp(int temp){
        this.temp=temp;
    }
    //---------------------------------------------------
    public int getTemp() {
        return temp;
    }
    //---------------------------------------------------
    public boolean isHot(){
        if(this.temp<this.range)
            return false;
        else
            return true;
    }
}
