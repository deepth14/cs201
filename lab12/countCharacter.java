package lab12;

public class countCharacter {
    public static void main(String[] args) {
        String str = "depthD";
        countChar(str);
        System.out.println(countChar(str));

    }

    //    public static int factorial(int n){
//        if(n==1){
//            return 1;
//        }else
//           return n*(n-1);
    //  }
    public static int countChar(String str) {

        int x = str.length();
        if (x == 0) {
            return 0;
        } else {
            return 1 + countChar(str.substring(0, str.length() - 1));


        }
    }
}

