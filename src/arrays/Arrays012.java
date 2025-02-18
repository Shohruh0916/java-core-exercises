package arrays;

import java.util.Scanner;

public class Arrays012 {
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
        for(int i=0; i<n; i+=2){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}