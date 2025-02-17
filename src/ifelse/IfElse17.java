package ifelse;

import java.util.Scanner;

public class IfElse17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        if((a<b && b<c) || (a>b && b>c)){
            a=2*a;
            b=2*b;
            c=2*c;
        }else{
            a=-a;
            b=-b;
            c=-c;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
