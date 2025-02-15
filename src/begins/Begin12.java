package begins;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double p=a+b+c;
        System.out.println("c="+c);
        System.out.println("p="+p);
    }
}
