package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        boolean result=a>2 && b<=3;
        System.out.println(result);
    }
}
