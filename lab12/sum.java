package lab12;

public class sum {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        System.out.println(summ(a,0));

    }
    public static int summ(int[]a, int k ) {
        if (a.length == 0|| k==a.length) {
            return 0;
        } else
        {
            return a[k]+summ(a, k+1);
        }

    }
}