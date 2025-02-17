package ifelse;

import java.util.Scanner;

public class IfElse27 {
    public static void main(String[] args) {
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=0;
        if(x<0){
            System.out.println(0);
        }else if(x%2==0){
            System.out.println(1);
        }else if(x%2!=0){
            System.out.println(-1);
        }
    }
}
