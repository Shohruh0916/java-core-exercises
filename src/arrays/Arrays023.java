package arrays;

import java.util.Scanner;

public class Arrays023 {
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
        int sum=0,num=0;
        for(int i=0; i<n; i++){
            if(i==k){
                for(int j=array[i]; j<array[l]; j++){
                    sum+=array[j];
                    num++;
                }
            }
        }
        int sum1=0,num1=0;
        for(int i=0; i<n; i++){
            sum1+=array[i];
            num1++;
        }
        int result=sum1-sum;
        System.out.println(result/(num1-num));
    }
}