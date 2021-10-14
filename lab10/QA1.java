package lab10;

public class QA1 {
    public static void main(String[] args) {
        double x;

        

        System.out.println();
    }
    double temperature[]=new double [365];
    double hottest =getHottest(temperature);
    public static double getHottest(double[] temp){
        double max=temp[0];
        for(int i =0;i<temp.length;i++){
        if(max<temp[i]){
                max=temp[i];
        }
    }return max;

}
double coldest = getColdest(temperature);
    public static double getColdest(double[] temp){
        double min =temp[0];
        for(int i=0;i<temp.length;i++){
            if(min>temp[i])
                min=temp[i];
        }
        return min;
    }
    public static double aveMonth(double[] temp, int month){
        double sum=0;
        int dayCount=0;
        try
        {
            while(dayCount<31){
                sum+=getTempOfDay(temp,month-1,dayCount+1);
                dayCount++;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){

        }
        return  (sum/dayCount);
    }
    public static  double getTempOfDay(double[] temp, int month, int day){
        int [ ] daysInEachMonth={31,28,2,32,13,5,31,30,13,12,29};
        if(day>daysInEachMonth[month-1]){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(month>12){
            throw new ArrayIndexOutOfBoundsException();
        }
        int i=0;
        for (int counter=0;counter<month-2;counter++){
            i+=daysInEachMonth[counter];
        }
        i+=day-1;
        return temp[i];
    }
    public double diffTemp(double[] temp,int month){
        double min;
        double max=min=getTempOfDay(temp,month-1,1);
        int dayCnt=2;
        try
        {
            while(dayCnt<31){
                double tempVal=getTempOfDay(temp,month-1,dayCnt);
                if(tempVal>max){
                    max=tempVal;
                }else if(tempVal<min){
                    min=tempVal;
                }
                dayCnt++;
            }
        }
        catch(ArrayIndexOutOfBoundsException EX){
    }
        return (max-min);

}
