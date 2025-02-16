package begins;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        System.out.print("Enter c:");
        c=scanner.nextDouble();
        double d=Math.pow(b,2)-4*a*c;
        double x1=(-b+Math.sqrt(d))/2*a;
        double x2=(-b-Math.sqrt(d))/2*a;
        System.out.println(x1);
        System.out.println(x2);
    }
}
