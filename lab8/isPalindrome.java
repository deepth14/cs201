package lab8;

public class isPalindrome {
    public static void main(String[] args) {
        String str ="KAYAKA";
        if(palindrome(str)){
            System.out.println("yes its palindrome");
        }else
            System.out.println("its not!!!!");

    }
        public static boolean palindrome (String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;


        }
}