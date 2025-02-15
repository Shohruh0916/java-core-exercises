package booleans;

import java.util.Scanner;

public class Boolean01 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        boolean result=a>0;
        System.out.println(result);
    }
}
