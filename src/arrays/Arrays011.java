package arrays;

import java.util.Scanner;

public class Arrays011 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array;
        int n;
        int k;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        System.out.print("Enter k:");
        k=scanner.nextInt();
        array=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("array["+i+"]=");
            array[i]=scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i%k==0){
                System.out.println("array["+i+"]="+array[i]);
            }
        }
    }
}