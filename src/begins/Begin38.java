package begins;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        System.out.print("Enter b:");
        b=scanner.nextDouble();
        double x=-b/a;
        System.out.println(x);

    }
}
