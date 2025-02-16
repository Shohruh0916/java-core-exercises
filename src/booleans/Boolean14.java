package booleans;

import java.util.Scanner;

public class Boolean14 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        boolean result=(a>0 && b<0 && c<0) || (a<0 && b>0 && c>0) || (c<0 && a>0 && b>0) ;
        System.out.println(result);
    }
}
