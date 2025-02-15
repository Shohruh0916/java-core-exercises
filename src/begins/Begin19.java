package begins;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        double x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        System.out.print("Enter y:");
        y=scanner.nextDouble();
        double s=x*y;
        double p=2*(x+y);
        System.out.println("s="+s);
        System.out.println("p="+p);
    }
}
