package InClassEx;

import java.util.Scanner;

public class finMin {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("give an array list to see the min from the list:");
        int[] arr = {1,2,3,-1,2,23,-23,123};
       // int sr=s.nextInt();
        System.out.println("Minimum is :" + minValue(arr, 0));
    }
   public static  int minValue(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        else
            return Math.min(arr[index], minValue(arr, index + 1));
    }


}
