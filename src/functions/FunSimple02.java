
package functions;

import java.util.Scanner;

public class FunSimple02 {
    public static void PowerA234(double a) {
        System.out.println(a * a );
        System.out.println(a * a*a );
        System.out.println(a * a *a*a);
    }
    public static void PowerA234() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = scanner.nextFloat();
        System.out.print("Enter b: ");
        float b = scanner.nextFloat();
        System.out.print("Enter c: ");
        float c = scanner.nextFloat();
        System.out.print("Enter d: ");
        PowerA234(a);
        PowerA234(b);
        PowerA234(c);
    }
    public static void main(String[] args) {
        PowerA234();
    }
}
