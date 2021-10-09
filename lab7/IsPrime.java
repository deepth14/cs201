package lab7;
// 4,5
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        /*a*/
        Scanner x = new Scanner(System.in);
        int y;
        y = x.nextInt();
           while (y > 0) {

            if (prime(y))
                System.out.println("its prime");
            else
                System.out.println("its not prime");
               System.out.println("enter a number again");
               y = x.nextInt();
        }
           int count=0;
           //for(int i=2;i<=100;i++){
//               if(prime(i)) {
//                   count = count + 1;
//                   System.out.println(i);
//               }
//           }
//        System.out.println(count);
          // }
        boolean isPrime=true;
        for(int i=2;i<=100;i++){
            isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                count++;
        }
        System.out.println(count);
        }
        public static boolean prime(int num){
        boolean x=true;
        for(int i=2;i<num;i++){
                if(num%i==0){
                    x=false;
                    break;
                }
        }
        return x;
    }
}
