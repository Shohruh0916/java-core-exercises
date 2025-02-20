package cases;

import java.util.Scanner;

public class Cases13 {
    public static void main(String[] args) {
        double a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the side:");
        a=scanner.nextDouble();
        System.out.print("Enter the order one element:");
        b=scanner.nextInt();
        switch(b){
            case 1:
                System.out.println("leg:"+a); break;
            case 2:
                System.out.println("hypotenuse:"+a*Math.sqrt(2)); break;
            case 3:
                System.out.println("altitude:"+a*Math.sqrt(2)/2);
                break;
            case 4:
                System.out.println("area:"+a*a/2); break;
            default:
                System.out.println("😒");
        }
    }
}



