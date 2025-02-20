package procedures;

import java.util.Scanner;

public class FunSimple01 {
    public static void PowerA3(double a) {
        System.out.println(a * a * a);
    }
    public static void PowerA3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("Enter e: ");
        int e = scanner.nextInt();
        PowerA3(a);
        PowerA3(b);
        PowerA3(c);
        PowerA3(d);
        PowerA3(e);
    }
    public static void main(String[] args) {
        PowerA3();
    }
}
