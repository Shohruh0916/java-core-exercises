package cases;

import java.util.Scanner;

public class Cases12 {
    public static void main(String[] args) {
        double r;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("r=");
        r = sc.nextDouble();
        System.out.print("a=");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println(r);
                break;
            case 2:
                System.out.println(2 * r);
                break;
            case 3:
                System.out.println(2 * Math.PI * r);
                break;
            case 4:
                System.out.println(Math.PI * Math.pow(r, 2));
                break;
            default:
                System.out.println("xato");
        }
    }
}



