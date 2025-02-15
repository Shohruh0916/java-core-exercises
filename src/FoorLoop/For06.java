package FoorLoop;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter :");
        a=scanner.nextInt();
        for(double i=1.2; i<=2; i+=0.2){
            System.out.println(i+" kg"+"="+i*a+" so'm");
        }
    }
}
