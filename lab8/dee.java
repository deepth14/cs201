package lab8;

import java.util.Scanner;

public class dee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n =s.nextInt();
        int[] numbers= new int[n];
        System.out.println("enter numbers wth duplicate");
        for(int i=0;i<n;i++){
            numbers[i]= s.nextInt();
        }
        int dep = removeDep(numbers);
        for(int i=0;i<dep;i++){
            System.out.println(numbers[i]+ " ");
            System.out.println();
        }


    }
    public static int removeDep(int[]numbers){
        int i,key,j,l=0;

        for( i=0;i<numbers.length;i++){
            key=numbers[i];
            j=i-1;
            while(j>=0 &&numbers[j]>key){
                numbers[j+1]=numbers[j];
                j-=1;
            }
            numbers[j+1]=key;
        }
        // removing
        for(int k=0;k<numbers.length;k++){
            if(numbers[k]!=numbers[k+1]){
                numbers[l++]=numbers[k];
            }
        }
        numbers[l++]=numbers[numbers.length-1];
        return 1;
    }
}
