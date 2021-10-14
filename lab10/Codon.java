package lab10;
import java.util.Arrays;
import java.util.Scanner;
public class Codon {

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("Enter the dna");
            String sent=input.nextLine();
            int n=(sent.length())/3;
            System.out.println(sent.length());
            String [] codon= new String[n];
            for (int j=0,i = 0; j< n && i <=(3*n) ; i+=3, j++) {
                codon[j] = sent.substring((i), (i + 3));
            }
            for (String s:codon) {
                System.out.println(s);
            }
            System.out.println(Arrays.toString(codon));


        }
}
