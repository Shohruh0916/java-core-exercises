package foorloop;

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int sum=0;
        for(int i=a; i<=b; i++){
            sum+=i;
        }
        System.out.println("sum:"+sum);
    }
}
