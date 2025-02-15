package booleans;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        boolean result=(a%2!=0 && b%2==0 )|| (b%2!=0 && a%2==0);
        System.out.println(result);
    }
}
