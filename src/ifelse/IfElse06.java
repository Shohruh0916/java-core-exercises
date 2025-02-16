package ifelse;

import java.util.Scanner;

public class IfElse06 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int max=a;
        if(max<b){
            max=b;
        }
        System.out.println(max);
    }
}
