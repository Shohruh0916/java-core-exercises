

package string;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter str=");
        String str = scanner.nextLine();
        String result=str.toLowerCase();
        System.out.println(result);
    }
}
