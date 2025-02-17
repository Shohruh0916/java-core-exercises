
package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        double x = scanner.nextDouble();
        System.out.print("Enter y:");
        double y = scanner.nextDouble();
        boolean result= (x+y)%2!=0;
        System.out.println(result);

    }
}
