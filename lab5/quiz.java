package lab5;

public class quiz {
    public static void main(String[] args) {
        printPriceCategory(640087);
    }
    public static void printPriceCategory(int num){
        if(num<=70000){
            System.out.println("Low");
        }else if (num<700000&&num<=220000){
            System.out.println("Medium");
        }else if(num>220000){
            System.out.println("High");
        }


    }
}
