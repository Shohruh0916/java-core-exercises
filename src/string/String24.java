
package string;

import java.util.Scanner;

public class String24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Binary sonni kiriting: ");
        String binaryString = scanner.nextLine();
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("O‘nlikdagi qiymati: " + decimalValue);
    }
}
