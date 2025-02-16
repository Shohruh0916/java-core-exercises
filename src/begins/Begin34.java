package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        double x,y,a,b;
        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        System.out.print("Enter y:");
        y=scanner.nextDouble();
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        System.out.println(a/x-b/y);


    }
}
