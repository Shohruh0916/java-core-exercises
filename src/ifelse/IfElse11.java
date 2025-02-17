package ifelse;

import java.util.Scanner;

public class IfElse11 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int max=a;
        if(max<b){
            max=b;
        }
        if(a!=b){
            a=max;
            b=max;
        }else{
            a=0; b=0;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
