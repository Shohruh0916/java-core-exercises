package arrays;

import java.util.Scanner;

public class Arrays020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        System.out.print("Enter l:");
        int l=scanner.nextInt();
        int [] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            if(i==k){
                for(int j=array[i]; j<array[l]; j++){
                    sum+=array[j];
                }
            }
        }
        System.out.println(sum);
    }
}