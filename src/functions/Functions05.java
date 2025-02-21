package functions;

import java.util.Scanner;

public class Functions05 {
    public  static  void Triangle(double a, double h){
        double b=Math.pow((a/2),2)+Math.pow(h,2);
        double result=a+b+b;
        System.out.println(result);
    }
    public  static  void Triangle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter h:");
        double h=scanner.nextDouble();
        Triangle(a,h);
    }
    public static void main(String[] args) {
        Triangle();
    }
}
