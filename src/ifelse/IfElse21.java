package ifelse;

import java.util.Scanner;

public class IfElse21 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextInt();
        System.out.print("Enter y:");
        y=scanner.nextInt();
        if(x==0 && y==0){
            System.out.println(0);
        }else if(y == 0){
            System.out.println(1);
        }else if(x==0){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}
