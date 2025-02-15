package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        double v=a*a*a;
        double s=6*a*a;
        System.out.println("v="+v);
        System.out.println("s="+s);

    }
}
