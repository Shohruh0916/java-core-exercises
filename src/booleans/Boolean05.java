package booleans;

import java.util.Scanner;

public class Boolean05 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        boolean result=a>=0 && b<-2;
        System.out.println(result);
    }
}
