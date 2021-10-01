package LABS;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        double fah,celsius;
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a temp in celsius:");
        celsius=scn.nextDouble();
        fah=1.8*celsius+32;
        System.out.println("the temp in fahrenheit:"+fah);
    }
}
