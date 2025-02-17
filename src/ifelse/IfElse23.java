package ifelse;

import java.util.Scanner;

public class IfElse23 {
    public static void main(String[] args) {
        int x1,x3,x2,x4 = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1:");
        x1=scanner.nextInt();
        System.out.print("Enter x2:");
        x2=scanner.nextInt();
        System.out.print("Enter x3:");
        x3=scanner.nextInt();
        if (x1==x2){
            x4=x3;
        }else if(x1==x3){
            x4=x2;
        }else if(x2==x3){
            x4=x1;
        }
        System.out.println(x4);
    }
}
