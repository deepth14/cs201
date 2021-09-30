package Labs;

import java.util.Scanner;

public class L2q2 {
    public static void main(String[] args) {
        /*2-) Write a program that accepts a string input and outputs the number of characters in the string
and the first and last character in separate lines. For 80 Chapter 2 Getting Started with Java
example, if the input is, I like Java then the output would be
11
I
a
*/
        Scanner input=new Scanner(System.in);
        System.out.println("write some thing here:");

       String  user=input.nextLine();
       int x=user.length();
       char first=user.charAt(0);
       char last=user.charAt(x-1);
        System.out.println(x);
       System.out.println(first);
        System.out.println(last);

    }
}
