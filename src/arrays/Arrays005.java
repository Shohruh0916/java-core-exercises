package arrays;

import java.util.Scanner;

public class Arrays005 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array;
        int n;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        array=new int[n];
        array[0]=0;
        array[1]=1;
        for(int i=2; i<n; i++){
            array[i]=array[i-1]+array[i-2];
        }
        for(int i=0; i<n; i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
