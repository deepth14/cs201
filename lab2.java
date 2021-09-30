package Labs;
import java.util.Locale;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {


    /*
    1-) Input the user’s first, middle, and last name as three separate strings and display the name in
the order of the first name, the middle initial, and the last name. Include the period after the
middle initial. If the input strings are Wolfgang, Amadeus, and Mozart, for example, then the
output would be Wolfgang A. Mozart. Use the console window for output.

    **/


        Scanner key = new Scanner(System.in);
        System.out.println("enter first name: ");
        String name = key.next();
        String M_name = key.next();
        String l_name3 = key.next();
        String res = name + " " + M_name.substring(0, 1).toUpperCase() + "." + " " + l_name3;
        System.out.println(res);
    }
}
