package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        double x1,x2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1:");
        x1=scanner.nextDouble();
        System.out.print("Enter x2:");
        x2=scanner.nextDouble();
        double result=Math.abs(x2-x1);
        System.out.println("result:"+result);

    }
}
