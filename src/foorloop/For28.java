package foorloop;

import java.util.Scanner;

public class For28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter x (|x| < 1): ");
        double x = scanner.nextDouble();
        double sum = x + 1;
        double term = x;
        int factorial = 1;
        int y = 1;
        for (int i = 1; i <= n; i++) {
            term *= x * x;
            y *= (2 * i );
            factorial *= (2 * i) * (2 * i );
            sum += (y * term) / factorial;
        }
        System.out.println("Yig'indi:" + sum);
    }
}

