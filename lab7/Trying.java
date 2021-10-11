package lab7;

public class Trying {
    public static String get(int num,String x){
        String y=" ";
        int count=0;
        int index=0;
        int count1=0;
        int index1=0;
       x=x.trim();
        for(int i=0;i<x.length();i++) {
            if (x.charAt(i)==' ' && count<num){
                count++;
                index=i;
            }
            if(x.charAt(i)==' ' && count<=(num-1)){
                count1++;
                index1=i;
            }
        }

        y=x.substring(index1,index);
        return y;
    }

    public static void main(String[] args) {
        System.out.println( get(1,"this is devo house kemey "));
    }
}
