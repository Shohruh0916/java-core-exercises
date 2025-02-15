package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double s=a*b;
        double p=2*(a+b);
        System.out.println("s="+s);
        System.out.println("p="+p);

    }
}
