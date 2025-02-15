package foorloop;

import java.util.Scanner;

public class For23 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter x: ");
                double x = sc.nextDouble();
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                double yigindi = x;
                double had = x;
                int ishora = -1;
                for (int i = 1; i <= n; i++) {
                    int daraja = 2 * i + 1;
                    had *= (x * x) / (daraja * (daraja - 1));
                    yigindi += ishora * had;
                    ishora = -ishora;
                }
                System.out.println("Natija: " + yigindi);
            }
        }


