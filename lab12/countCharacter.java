package lab12;

public class countCharacter {
    public static void main(String[] args) {
        String str="depthD";
        countChar(str,str);
        System.out.println(countChar(str,str));

    }
    //    public static int factorial(int n){
//        if(n==1){
//            return 1;
//        }else
//           return n*(n-1);
    //  }
    public static  int countChar(String str,String characters){

        int x=str.length();
        if(x==0){
            return 0;
        } else if(str.substring(0,1).equals(characters)){
            return 1+countChar(str.substring(1),characters);
        }else
            return 1+countChar(str.substring(1),characters);


    }
}


