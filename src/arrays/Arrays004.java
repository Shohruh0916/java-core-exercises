package arrays;

import java.util.Scanner;

public class Arrays004 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array;
        int n;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        System.out.print("Enter d:");
        int d=scanner.nextInt();
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        array=new int[n];
        array[0]=a;
        for(int i=1; i<n; i++){
            array[i]=array[i-1]*d;
        }
        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}
