public class MaxOrMin extends Thread{
    int a,b;
    double min,max;
    double[] tab;
    public MaxOrMin(double[] tab, int a, int b){
        this.a=a;
        this.b=b;
        this.tab=tab;
    }

    public void setMin(double min){
        this.min=min;
    }

    public void setMax(double max){
        this.max=max;
    }

    public double getMin(){
        return min;
    }

    public double getMax(){
        return max;
    }

    @Override
    public void run() {
        double min=tab[0],max=tab[0];
        for(int i=a;i<b;i++){
            if(tab[i]<min)
                min=tab[i];
            if(tab[i]>max)
                max=tab[i];
        }
        setMin(min);
        setMax(max);
    }
}
