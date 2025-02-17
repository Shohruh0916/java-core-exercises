package ifelse;

import java.util.Scanner;

public class IfElse19 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        System.out.print("Enter d:");
        d=scanner.nextInt();
        if(a==b && d==b){
            System.out.println(3);
        }else if(a==c && c==d){
            System.out.println(2);
        }else if(b==c && c==d){
            System.out.println(1);
        }else if(a==b && b==c){
            System.out.println(4);
        }else{
            System.out.println("No😒");
        }
    }
}
