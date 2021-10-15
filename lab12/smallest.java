package lab12;

public class smallest {
//    public static void main(String[] args) {
//        //int[] arr = new int[4];
//        int[] arr = {21, 2, 3, 41, -2};
//        System.out.println(findSmallest(arr, 5));
//    }
//
//    public static int findSmallest(int[] arr1, int n) {
//        int index = n;
//        index = arr1[1];
//        int[] arr = {21, 2, 3, 41, -2};
//        int min = arr[0];
//        int A = arr.length;
//        for (int i = 0; i < arr.length; i++) {
////        if(arr[i]<min){
////            min=arr[0];
////        }
////
////        }
////        return min;
//            if (A == 1) {
//                return 1;
//            } else {
//                //return Math.min(arr[n - 1], findSmallest(arr1, n + 1));
//                return findSmallest(arr1[n - 1], n + 1);
//            }
//        }
//        public  static int min (int [] arr, int n){
//            if(n ==)
//        }
   static int min = Integer.MAX_VALUE;
    public static int min(int []arr, int n){
        if(arr.length-1==n){
            return arr[n];
        }
        if(arr[n]<min){
            min=arr[n];
             min(arr,n+1);
        }else{
             min(arr,n+1);
        }
       return min;
    }

    public static void main(String[] args) {

        int[]arr={1,-32,10,4,-5,12,-11,-1};
        System.out.println(min(arr,0));
    }
    }



