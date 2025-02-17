
package booleans;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        double x = scanner.nextDouble();
        System.out.print("Enter y:");
        double y = scanner.nextDouble();
        System.out.print("Enter z:");
        double z=scanner.nextDouble();
        if(y==Math.sqrt(Math.pow(x,2)+Math.pow(z,2))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
