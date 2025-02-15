package begins;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double sum=a+b;
        double y=a*b;
        System.out.println("sum:"+sum);
        System.out.println("y:"+y);
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
    }
}
