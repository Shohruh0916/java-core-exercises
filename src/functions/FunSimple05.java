
package functions;

import java.util.Scanner;

public class FunSimple05 {
    public static void RectPS(int x1, int y1, int x2, int y2, int[] results) {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int area = width * height;
        int perimeter = 2 * (width + height);
        results[0] = area;
        results[1] = perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 ni kiriting: ");
        int x1 = scanner.nextInt();
        System.out.print("y1 ni kiriting: ");
        int y1 = scanner.nextInt();
        System.out.print("x2 ni kiriting: ");
        int x2 = scanner.nextInt();
        System.out.print("y2 ni kiriting: ");
        int y2 = scanner.nextInt();
        int[] results = new int[2];
        RectPS(x1, y1, x2, y2, results);
        System.out.println("To'g'ri to'rtburchak yuzasi: " + results[0]);
        System.out.println("To'g'ri to'rtburchak perimetri: " + results[1]);

    }
}

