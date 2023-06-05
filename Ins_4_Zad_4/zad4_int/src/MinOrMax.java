public class MinOrMax extends Thread{
    int a,b,min,max;
    int[] tab;
    public MinOrMax(int[] tab, int a, int b){
        this.a=a;
        this.b=b;
        this.tab=tab;
    }

    public void setMin(int min){
        this.min=min;
    }

    public void setMax(int max){
        this.max=max;
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    @Override
    public void run() {
        int min=tab[0],max=tab[0];
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
