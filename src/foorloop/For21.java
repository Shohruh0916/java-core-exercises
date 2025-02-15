package foorloop;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        double result=0;
        int s=1;
        for(int i=1; i<=n; i++){
            s*=i;
            result+=1.0/s;
        }
        System.out.println(result+1);
    }
}
