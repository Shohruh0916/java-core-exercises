package ifelse;

import java.util.Scanner;

public class IfElse07 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int min=a;
        if(min>b){
            min=b;
        }
        if(min == a){
            System.out.println(1);
        }else {
            System.out.println(2);
        }

    }
}
