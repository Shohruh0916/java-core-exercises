package integers;

import java.util.Scanner;

public class Integers05 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int x=a/b;
        int result=a-b*x;
        System.out.println(result);
    }
}
