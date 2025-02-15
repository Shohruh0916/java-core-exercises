package foorloop;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int result=1;
        for(int i=1; i<=n; i++){
            result*=i;
        }
        System.out.println(result);
    }
}
