package lab8;

import java.util.Scanner;

public class upperCaseCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a Sentence With Uppercase then you will find out how many of them are in the sentence:");
        String s=scan.nextLine();
        int counter=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                counter++;
            }
        }
        System.out.println("upper case from the given sentence is: "+counter);
    }
}
