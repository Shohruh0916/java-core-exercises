
package procedures;

import java.util.Scanner;

public class FunSimple11 {
    public  static void Minmax(int x,int y){
        int min=x,max=y;
        if(min>y){
            min=y;
        }
        if(max<x){
            max=x;
        }
        x=min;
        y=max;
        System.out.println(x+""+y);
    }
    public  static void Minmax(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        int x=scanner.nextInt();
        System.out.print("Enter y:");
        int y=scanner.nextInt();
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        System.out.print("Enter c:");
        int c=scanner.nextInt();
        System.out.print("Enter d:");
        int d=scanner.nextInt();
        Minmax(a,b);
    }

    public static void main(String[] args){
        Minmax();
    }
}
