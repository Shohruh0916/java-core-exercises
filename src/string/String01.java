package string;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c= scanner.next().charAt(0);
        int result= (int) c;
        System.out.println(result);
    }
}
