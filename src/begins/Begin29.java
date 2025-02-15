package begins;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=scanner.nextInt();
        double result=Math.PI*a/180;
        System.out.println(result+" radians");


    }
}
