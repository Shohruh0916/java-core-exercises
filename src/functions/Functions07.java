package functions;

import java.util.Scanner;

public class Functions07 {
    public static void Calc(double a, double b, int n){
        switch(n){
            case 1:
                System.out.println(a-b); break;
            case 2:
                System.out.println(a*b); break;
            case 3:
                System.out.println(a/b); break;
            default:
                System.out.println(a+b);
        }
    }
    public static void Calc(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        Calc(a,b,n);
    }
    public static void main(String[] args) {
        Calc();
    }
}
