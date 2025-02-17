package foorloop;

import java.util.Scanner;

public class For24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter x:: ");
        double x = scanner.nextDouble();
        double sum = 1;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term *= -1 * x * x / ((2 * i - 1) * (2 * i));
            sum += term;
        }

        System.out.println("Yig'indi: " + sum);
            }
        }


