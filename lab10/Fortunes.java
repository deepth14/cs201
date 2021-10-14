package lab10;

import java.util.Random;
import java.util.Scanner;

public class Fortunes {



        public static void main(String[] args) {
            fortunes();
        }
        public static void fortunes(){
            Scanner input =new Scanner(System.in);
            System.out.println("Wana know your fortune,Enter yes or no");
            String ans= input.nextLine();
            while(ans.equals("yes")){
                Random random= new Random();
                String [] rand={"u will get 4 gpa", " get a good job"," will be rich", "will get
                        money",
                        "will be the guest of honour","will get a price","will marry a queen",
                        "will smile","give birth","always happy"};
                int nchoice=random.nextInt(rand.length);
                System.out.println(rand[nchoice]);
                System.out.println("Wana know your fortune,Enter yes or no");
                ans= input.nextLine();
            }
        }
    }
