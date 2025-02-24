

package string;

import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if (input.matches("-?\\d+")) {
            System.out.println(1);
        } else if (input.matches("-?\\d+\\.\\d*[1-9]\\d*")) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
