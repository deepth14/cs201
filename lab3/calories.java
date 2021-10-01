package LABS;

import java.util.Scanner;

public class calories {
    public static void main(String[] args) {
        int calories,weight;
        Scanner s=new Scanner(System.in);
        System.out.println("enter weight is pounds:");
        weight= s.nextInt();
        calories=weight*19;
        System.out.println("the calories that a person need per day is:"+calories);

    }
}
