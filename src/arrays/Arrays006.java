package arrays;

import java.util.Scanner;

public class Arrays006 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array;
        int n,a,b;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        array=new int[n];
        array[0]=a;
        array[1]=b;
        for(int i=2; i<n; i++){
            array[i]=array[i-1]+array[i-2];
        }
        for(int i=0; i<n; i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
