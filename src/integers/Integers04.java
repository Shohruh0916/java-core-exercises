package integers;

import java.util.Scanner;

public class Integers04 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.println("Enter b:");
        b=scanner.nextInt();
        int result=a/b;
        System.out.println(result);
    }
}
