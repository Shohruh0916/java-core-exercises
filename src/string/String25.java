
package string;

import java.util.Scanner;

public class String25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O‘nlik sonni kiriting: ");
        int decimalNumber = scanner.nextInt();
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Binarydagi qiymati: " + binaryString);
    }
}
