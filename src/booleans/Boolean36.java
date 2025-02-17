
package booleans;

import java.util.Scanner;

public class Boolean36 {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1:");
        x1=scanner.nextInt();
        System.out.print("Enter y1:");
        y1=scanner.nextInt();
        System.out.print("Enter x2:");
        x2=scanner.nextInt();
        System.out.print("Enter y2:");
        y2=scanner.nextInt();
        boolean result= x1==x2 || y1==y2;
        System.out.println(result);
    }
}
