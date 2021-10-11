package lab7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = scan.nextLine();
        int lowerCase = 0;
        for( int i = 0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowerCase++;
            }


	     }
System.out.println("Number of lower case letters is: " + lowerCase);

//       // String str ="DiBO";
//
//        System.out.println(countSmallCharacters("Bis"));
//
//    }
//    public static int countSmallCharacters(String str){
//        int cnt=0;
//
//        for(int i=0;i<str.length();i++){
//            char c=str.charAt(i);
//            if(Character.isLowerCase(c));
//            cnt++;
//
//        }
//        return cnt;
    }
}
