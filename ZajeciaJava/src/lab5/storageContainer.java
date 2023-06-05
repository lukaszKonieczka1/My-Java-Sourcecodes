package lab5;

public class storageContainer {
    int capacity, fillLevel;

    public storageContainer(int capacity, int fillLevel){
        this.capacity=capacity;
        this.fillLevel=fillLevel;
    }
    //---------------------------------------------------
    public void setFillLevel(int fillLevel){
        this.fillLevel=fillLevel;
    }
    //---------------------------------------------------

    public boolean isFull(){
        if(this.capacity==this.fillLevel)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(this.fillLevel==0)
            return true;
        else
            return false;
    }

    //---------------------------------------------------

    public int getCapacity() {

        return capacity;
    }

    public int getFillLevel() {

        return fillLevel;
    }
}
