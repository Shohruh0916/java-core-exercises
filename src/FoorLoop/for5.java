package FoorLoop;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter :");
        a=scanner.nextInt();
        for(double i=0.1; i<=1; i+=0.1){
            System.out.println(i+" kg"+"="+i*a+" so'm");
        }
    }
}
