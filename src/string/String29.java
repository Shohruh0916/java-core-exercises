
package string;

import java.util.Scanner;

public class String29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s1:");
        String s1=scanner.nextLine();
        System.out.print("Enter s2:");
        String s2=scanner.nextLine();
        System.out.print("Enter c:");
        char c=scanner.nextLine().charAt(0);
        String result = s1.replace(String.valueOf(c), String.valueOf(c) + c);
        String result1=s2.concat(result);
        System.out.println(result1);



    }
}
