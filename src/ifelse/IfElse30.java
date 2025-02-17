package ifelse;

import java.util.Scanner;

public class IfElse30 {
    public static void main(String[] args) {
        int x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextInt();
        if(x>=1 && x<10 && x%2!=0){
            System.out.println("bir xonali toq");
        }else if(x>=1 && x<10){
            System.out.println("bir xonali juft");
        }else if(x>=10 && x<100 && x%2==0){
            System.out.println("ikki xonali juft");
        }else if(x>=10 && x<100){
            System.out.println("ikki xonali toq");
        }else if(x>=100 && x<1000 && x%2==0){
            System.out.println("uch xonalli juft");
        }else if(x>=100 && x<1000){
            System.out.println("uch xonali toq");
        }
    }
}
