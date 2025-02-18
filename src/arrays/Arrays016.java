package arrays;

import java.util.Scanner;

public class Arrays016 {
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
        for (int i=0; i<n/2; i++) {
            System.out.println(array[i]);
            if (n-1-i>i) {
                System.out.println(array[n-1-i]);
            }
        }
    }
}