package ifelse;

import java.util.Scanner;

public class IfElse04 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        int num=0;
        if(a>0){
            num++;
        }
        if(b>0){
            num++;
        }
        if(c>0){
            num++;
        }
        System.out.println(num);
    }
}
