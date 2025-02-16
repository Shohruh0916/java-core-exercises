package ifelse;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        if(a>0){
            System.out.println(a+1);
        }else {
            System.out.println(a-2);
        }

    }
}
