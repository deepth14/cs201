package lab8;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String input =s.nextLine();
        int count[]= new int[5];
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a'|| ch=='A'){
                count[0]++;
            }if(ch=='e'||ch=='E'){
                count[1]++;
            }if(ch=='i'||ch=='I'){
                count[2]++;
            }if(ch=='o'||ch=='O'){
                count[3]++;
            }if(ch=='u'||ch=='U'){
                count[4]++;
            }
        }
        System.out.println("# of 'a': "+count[0]);
        System.out.println("# of 'e': "+count[1]);
        System.out.println("# of 'i': "+count[2]);
        System.out.println("# of 'i': "+count[3]);
        System.out.println("# of 'i': "+count[4]);
    }


    }


