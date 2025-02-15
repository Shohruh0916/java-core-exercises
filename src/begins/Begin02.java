package begins;

import java.util.Scanner;

public class Begin02 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextDouble();
        double result=a*a;
        System.out.println("result:"+result);
    }
}
