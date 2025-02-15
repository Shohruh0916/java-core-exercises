package begins;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        double x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.println("result:"+function);
    }
}
