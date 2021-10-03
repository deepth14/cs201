package lab4;

public class WeightConverter {
    double earthWght;
    public WeightConverter(double earthWght){
        this.earthWght=earthWght;

    }
    public double con(double earthWght){
        double result = earthWght*0.167;
        return result;
    }

}
