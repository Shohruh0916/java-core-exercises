package ifelse;

import java.util.Scanner;

public class IfElse24 {
    public static void main(String[] args) {
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=0;
        if(x>0){
             function=2*Math.sin(x);
        }else{
             function=x-6;
        }
        System.out.println(function);
    }
}
