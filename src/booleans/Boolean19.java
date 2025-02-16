package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        boolean result= a%2==0 || b%2==0 || c%2==0;
        System.out.println(result);
    }
}
