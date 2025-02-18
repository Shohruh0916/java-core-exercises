package arrays;

import java.util.Scanner;

public class Arrays002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array;
        int n;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=(int) Math.pow(2,i);
        }
        for(int i=0; i<n; i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
