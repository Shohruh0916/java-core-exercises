package ifelse;

import java.util.Scanner;

public class IfElse20 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        int result;
        if(Math.abs(a-b)>Math.abs(a-c)){
            result=Math.abs(a-c);
        }else{
            result=Math.abs(a-b);
        }
        System.out.println(result);
    }
}
