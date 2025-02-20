package functions;

import java.util.Scanner;

public class Functions02 {
    public static void RootCout(double a, double b,double c){
        double result=Math.pow(b,2)-4*a*c;
        System.out.println(result);
    }
    public static void RootCout(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter c:");
        double c=scanner.nextDouble();
        RootCout(a,b,c);
    }
    public static void main(String[] args) {
        RootCout();
    }
}
