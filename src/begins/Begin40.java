package begins;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        double a1,b1,c1,a2,b2,c2,d;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a1:");
        a1=scanner.nextDouble();
        System.out.print("Enter b1:");
        b1=scanner.nextDouble();
        System.out.print("Enter c1:");
        c1=scanner.nextDouble();
        System.out.print("Enter a2:");
        a2=scanner.nextDouble();
        System.out.print("Enter b2:");
        b2=scanner.nextDouble();
        System.out.print("Enter c2:");
        c2=scanner.nextDouble();
        d=a1*b2-a2*b1;
        double x=(c1*b2-c2*b1)/d;
        double y=(a1*c2-a2*c1)/d;
        System.out.println(x);
        System.out.println(y);



    }
}
