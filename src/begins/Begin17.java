package begins;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        System.out.print("Enter c:");
        c=scanner.nextDouble();
        double ac=Math.abs(c-a);
        double bc=Math.abs(c-b);
        double result=ac+bc;
        System.out.println("ac="+ac);
        System.out.println("bc="+bc);
        System.out.println("result="+result);
    }
}
