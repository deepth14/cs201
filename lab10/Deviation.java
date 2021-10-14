package lab10;

import java.util.Scanner;

public class Deviation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number values");
        int num= input.nextInt();
        Deviation.sDev(num);
    }
    public static void sDev(int n){
        double sdev=0.0;
        double mean=0.0;
        double sum=0.0, sums=0.0;
        Scanner input= new Scanner(System.in);
        int [] x= new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("please Enter the next values ");
            x [i]= input.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];
        }
        mean=sum/n ;
        System.out.println("mean "+ mean);
        for (int i = 0; i < x.length; i++) {
            sums+=(Math.pow((x[i]-mean),2));
        }
        System.out.println("sum of squares " + sums);
        sdev=Math.sqrt((sums/n));
        sdev=Math.round(sdev*100.0)/100.0;
        System.out.println("The standard deviation is "+sdev);
    }

}


