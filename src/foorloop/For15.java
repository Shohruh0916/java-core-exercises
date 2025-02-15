package foorloop;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        int n;
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        System.out.print("Enter a:");
        a=sc.nextDouble();
        double result=1.0;
        for(int i=1; i<=n; i++){
            result*=a;
        }
        System.out.println(result);
    }
}
