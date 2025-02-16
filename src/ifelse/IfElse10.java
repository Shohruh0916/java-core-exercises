package ifelse;

import java.util.Scanner;

public class IfElse10 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        if(a!=b){
            System.out.println("a="+(a+b));
            System.out.println("b="+(a+b));
        }else if(a==0){
            System.out.println("a="+0);
            System.out.println("b="+0);
        }
    }
}
