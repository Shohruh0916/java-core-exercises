package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        double x,y,a;
        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        System.out.print("Enter y:");
        y=scanner.nextDouble();
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.println(a/x);
        System.out.println(a*y/x);


    }
}
