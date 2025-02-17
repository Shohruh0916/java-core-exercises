package ifelse;

import java.util.Scanner;

public class IfElse12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
       int min=a;
       if(min>b){
           min=b;
       }else if(min>c){
           min=c;
       }
        System.out.println(min);
    }
}
