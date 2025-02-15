package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        System.out.print("Enter c:");
        c=scanner.nextDouble();
        double v=a*b*c;
        double s=2*(a*b+b*c+a*c);
        System.out.println("v="+v);
        System.out.println("s="+s);
    }
}
