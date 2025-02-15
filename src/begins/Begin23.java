package begins;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        int x;
        x=a;
        a=c;
        c=b;
        b=x;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        

    }
}
