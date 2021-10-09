package lab7;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int i,num,sum=0,j=0;
//        System.out.println("enter a number to check perfect or not:");

//        for(i=1;i<num;i++){
//            if(num%i==0){
//                sum+=i;
//            }
//        }
//        if(sum==num){
//            System.out.println(num+" "+"issa perfect number:");
//        }
      //  int i,num,sum=0,j;
        int[]arr=new int[100];
        num=input.nextInt();
        for(i=1;i<num;i++){
           if(num%i==0){
               sum+=i;
               arr[j]=i;
               j++;
           }
        }
        if(sum==num){
            System.out.println("issa perfect number:");

        for(i=0;i<num;i++){
            System.out.println(arr[i]+"");
        }
        }
        else{
            System.out.println("is not a perfect number");
        }




    }
}
