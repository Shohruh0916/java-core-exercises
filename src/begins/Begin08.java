package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double result=(a+b)/2;
        System.out.println("result:"+result);

    }
}
