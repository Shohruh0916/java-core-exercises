package ifelse;

import java.util.Scanner;

public class IfElse05 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        System.out.print("Enter c:");
        c=scanner.nextInt();
        int x=0,y=0;
        if(a>0){
            x++;
        }else{
            y++;
        }
        if(b>0){
            x++;
        }else{
            y++;
        }
        if(c>0){
            x++;
        }else{
            y++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
