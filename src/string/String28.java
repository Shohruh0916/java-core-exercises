
package string;

import java.util.Scanner;

public class String28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        char c=scanner.nextLine().charAt(0);
        String result = s.replace(String.valueOf(c), String.valueOf(c) + c);
        System.out.println(result);



    }
}
