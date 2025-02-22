package string;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter s1=");
        String s1=scanner.nextLine();
        System.out.print("Enter s2=");
        String s2=scanner.nextLine();
        String result=s1.concat(s2);
        System.out.println(result);
    }
}
