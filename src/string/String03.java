package string;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        char n=scanner.next().charAt(0);
        int s1= n -1;
        int s2= n +1;
        char result1= (char) s1;
        char result2=(char) s2;
        System.out.println(result1);
        System.out.println(result2);

    }
}
