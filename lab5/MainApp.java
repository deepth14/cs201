package lab5;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your input: ");
        double input = scan.nextDouble();
        double million = Math.pow(10, 6);
        double billion = Math.pow(10, 9);
        double trillion = Math.pow(10,12);
        double quadrillion = Math.pow(10, 15);
        double quintillion = Math.pow(10,18);
        double sextillion = Math.pow(10, 21);
        double nonillion = Math.pow(10, 30);
        double googol = Math.pow(10, 100);
        System.out.println("Power of 10 " + " " +" Number");
        if(Math.pow(10, 6) == input) {
            System.out.print("6 " + " " + " Million");
        }else if(Math.pow(10,9)==input) {
            System.out.print("9 " + " " + " Billion");
        }else if(Math.pow(10,12)==input) {
            System.out.println("12 " + " " + " Trillion");
        }else if(Math.pow(10,15)==input) {
            System.out.println("15 " + " " + " Quadrillion");
        }else if(Math.pow(10,18)==input) {
            System.out.println("18 " + " " + " Quintillion");
        }else if(Math.pow(10,21)==input) {
            System.out.println("21 " + " " + " Sextillion");
        }else if(Math.pow(10,30)==input) {
            System.out.println("30 " + " " + " Nonillion");
        }else if(Math.pow(10,100)==input){
            System.out.println("100 " + " " + " Googol");
        }

    }
}
