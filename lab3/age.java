package LABS;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        final int currentYear=2021;
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a year that your was born in:");
        a=in.nextInt();
        int urAge=currentYear-a;
        System.out.println("since you were born in :"+a+" "+" "+"you are "+urAge+"years old");

    }
}
