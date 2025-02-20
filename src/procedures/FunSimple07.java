
package procedures;

import java.util.Scanner;

public class FunSimple07 {
    public static void InvertDigit(int a) {
        while(a!=0){
            int s=a%10;
            a=a/10;
            System.out.print(s);
        }
        System.out.println();
    }
    public static void InvertDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        System.out.print("Enter c:");
        int c=scanner.nextInt();
        InvertDigit(a);
        InvertDigit(b);
        InvertDigit(c);
    }

    public static void main(String[] args) {
        InvertDigit();
    }
}
