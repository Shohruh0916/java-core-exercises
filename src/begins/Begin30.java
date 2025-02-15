package begins;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=scanner.nextDouble();
        double result=180*a/Math.PI;
        System.out.println(result);


    }
}
