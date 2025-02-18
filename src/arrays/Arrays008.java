package arrays;

import java.util.Scanner;

public class Arrays008 {
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
        int num=0;
        for(int i=0; i<n; i++){
            if(array[i]%2!=0){
                num++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
        System.out.println("num="+num);
    }
}