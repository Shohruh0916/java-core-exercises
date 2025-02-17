
package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        double x = scanner.nextDouble();
        System.out.print("Enter y:");
        double y = scanner.nextDouble();
        System.out.print("Enter z:");
        double z=scanner.nextDouble();
        boolean result= x+y>z || z+y<x || z+x<y;
        System.out.println(result);

    }
}
