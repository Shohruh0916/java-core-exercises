package ifelse;

import java.util.Scanner;

public class IfElse18 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        if(a==b){
            System.out.println(3);
        }else if(a==c){
            System.out.println(2);
        }else if(b==c){
            System.out.println(1);
        }
    }
}
