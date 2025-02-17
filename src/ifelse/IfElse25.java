package ifelse;

import java.util.Scanner;

public class IfElse25 {
    public static void main(String[] args) {
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=0;
        if(x<-2 || x>2){
            function=2*x;
        }else{
            function=-3*x;
        }
        System.out.println(function);
    }
}
