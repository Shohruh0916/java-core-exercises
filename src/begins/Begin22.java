package begins;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);

        

    }
}
