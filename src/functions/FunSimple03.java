
package functions;

import java.util.Scanner;

public class FunSimple03 {
    public static  void MEAN(float a,float b){
        double result=Math.sqrt(a*b);
        System.out.println(result);
    }
    public static void MEAN(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        float a=scanner.nextFloat();
        System.out.print("Enter b:");
        float b=scanner.nextFloat();
        System.out.print("Enter c:");
        float c=scanner.nextFloat();
        MEAN(a,b);
        MEAN(a,c);
        MEAN(b,c);

    }
    public static void main(String[] args){
        MEAN();
    }
}
