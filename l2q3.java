package Labs;
import java.util.Scanner;
public class l2q3 {
    public static void main(String[] args) {
        /*3-) Write a program that accepts a word and prints out the middle character. The length of the
input word is odd. For example, if the input is magnificent, which has 11 characters, you output
the sixth character f. You use the division operator /. This operator returns only the quotient. For
example, the expression 10/4 would result in 2 (not 2.5)*/
        Scanner in =new Scanner(System.in);
        System.out.println("Any words here:");
         String str=in.next();
         //char middle=str.substring(str.length()-)
        System.out.println(str+" "+str.substring((str.length()/2),(str.length()/2+1)));

    }
}
