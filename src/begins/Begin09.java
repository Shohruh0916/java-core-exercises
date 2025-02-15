package begins;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double result=Math.sqrt(a*b);
        System.out.println("result:"+result);

    }
}
