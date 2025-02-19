
package functions;

import java.util.Scanner;

public class FunSimple06 {
    public static void DigitCountSum(int a, int b ,int c){
        int result=a+b+c;
        System.out.println(result);
    }
    public static void DigitCountSum(){
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        DigitCountSum(a,b,c);
    }

    public static void main(String[] args) {
        DigitCountSum();
    }
}

