package LABS;

import java.util.Scanner;

public class lab_3q2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double inch,centi,feet;
        System.out.println("enter the values in centi meter");
        centi=key.nextDouble();
        feet=centi*0.0328084;
        inch=centi*0.0939701;
        System.out.println("the values in feet is:"+feet);
        System.out.println("the values inch is:"+inch);
    }
}
