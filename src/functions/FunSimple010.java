
package functions;

import java.util.Scanner;

public class FunSimple010 {
    public static void Swap(int a,int b){
        int x;
        x=a;
        a=b;
        b=x;
        System.out.println(a);
        System.out.println(b);
    }
    public static void Swap(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        System.out.print("Enter c:");
        int c=scanner.nextInt();
        System.out.print("Enter d:");
        int d=scanner.nextInt();
        Swap(a,b);
        Swap(c,d);
    }
    public static void main(String[] args){
        Swap();
    }
}
