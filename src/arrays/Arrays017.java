package arrays;

import java.util.Scanner;

public class Arrays017 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array;
        int n;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        array=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("array["+i+"]=");
            array[i]=scanner.nextInt();
        }
        int left=0,right=n-1;
        while(left<=right) {
            for(int i=0; i<2 && left<=right; i++) {
                System.out.println(array[left++]);
            }
            for(int i=0; i<2 && left<=right; i++) {
                System.out.println(array[right--]);
            }
        }
    }
}