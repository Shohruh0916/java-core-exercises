package ifelse;

import java.util.Scanner;

public class IfElse09 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int min=a;
        if(min>b){
            min=b;
        }
       int max=b;
        if(max<a){
            max=a;
        }
        a=max;
        b=min;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
