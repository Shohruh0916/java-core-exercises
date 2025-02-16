package booleans;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        boolean result= a%10!=a/10%10 && a%10!=a/100%10;
        System.out.println(result);
    }
}
