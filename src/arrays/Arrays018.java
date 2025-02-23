package arrays;

import java.util.Scanner;

public class Arrays018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

        int lastElement = a[9];
        int result = 0;
        for (int i = 0; i < 9; i++) {
            if (a[i] < lastElement) {
                result = a[i];
                break;
            }
        }
        System.out.println(result);
    }
}