package ifelse;

import java.util.Scanner;

public class IfElse26 {
    public static void main(String[] args) {
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=0;
        if(x<=0){
            function=-x;
        }else if(0<x && x<2){
            function=Math.pow(x,2);
        }else if(x>=2){
            function=4;
        }
        System.out.println(function);
    }
}
