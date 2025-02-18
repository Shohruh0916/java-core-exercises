package arrays;

import java.util.Scanner;

public class Arrays010 {
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
        for(int i=0; i<n; i++){
            if(array[i]%2==0){
                System.out.println("array["+i+"]="+array[i]);
            }
        }
        for(int i=array.length-1; i>=0; i--){
            if(array[i]%2!=0){
                System.out.println("array["+i+"]="+array[i]);
            }
        }
    }
}