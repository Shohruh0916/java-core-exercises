package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        double result=4*a;
        System.out.println("result:"+result);
    }
}
