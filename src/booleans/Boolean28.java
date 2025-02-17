
package booleans;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        double x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        System.out.print("Enter y:");
        y=scanner.nextDouble();
        boolean result= (y>0 && x>0) || (y<0 && x<0);
        System.out.println(result);
    }
}
