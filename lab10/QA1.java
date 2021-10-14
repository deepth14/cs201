package lab10;

public class QA1 {
    public static void main(String[] args) {

    }
    double temperature[]=new double [365];
    double hottest =getHottest(temperature);
    public double getHottest(double[] temp){
        double max=temp[0];
        for(int i =0;i<temp.length;i++){
        if(max<temp[i]){
                max=temp[i];
        }
    }return max;

}
double coldest = getColdest(temperature);
    public double getColdest(double[] temp){
        double min =temp[0];
        for(int i=0;i<temp.length;i++){
            if(min>temp[i])
                min=temp[i];
        }
        return min;
    }


}
