package integers;

import java.util.Scanner;

public class Integers29 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        int x1=a/c;
        int x2=b/c;
        int result=a*b-x1*x2;
        System.out.println(result);
    }
}
