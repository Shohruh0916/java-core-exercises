package foorloop;

import java.util.Scanner;

public class For26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter x (|x| < 1): ");
        double x = scanner.nextDouble();
        double sum = x;
        double term = x;
        for (int i = 1; i <= n; i++) {
            term *= -1 * x * x;
            sum += term / (2 * i + 1);
        }
        System.out.println("Yig'indi: " + sum);

    }
}

