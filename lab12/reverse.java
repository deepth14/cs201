package lab12;

public class reverse {
    public static void main(String[] args) {
        String str = "deebo";
        System.out.println(reverseStr(str));
    }
    public static String reverseStr(String str){
        if(str.length()==0|| str.equals(' ')){
            return " ";
        }else
        {
            return str.charAt(str.length()-1)+ reverseStr(str.substring(0,str.length()-1));
        }
    }
}
