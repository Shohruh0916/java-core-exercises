
package booleans;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        boolean result= Math.pow(b,2)-4*a*c>0;
        System.out.println(result);
    }
}
