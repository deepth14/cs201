package lab4;

public class MainApp {
    public static void main(String[] args) {
        WeightConverter moonWeight = new WeightConverter(160);
        double yourMoonWeight = moonWeight.con(160);
        System.out.println(yourMoonWeight);
    }
}
