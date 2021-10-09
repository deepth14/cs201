package lab7;


import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        int j,i;
        Scanner sr = new Scanner(System.in);
        System.out.println("enter a starting number:");
        int input1=sr.nextInt();
        System.out.println("enter an ending number:");
        int input2=sr.nextInt();

        for(i=1;i<=4;i++){

            for(j=0;j<10;j++){

                    System.out.print((i*10)+j+" ");


                }
            System.out.println(" ");
            }
        }

    }

