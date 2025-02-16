package integers;

import java.util.Scanner;

public class Integers28 {
    public static void main(String[] args) {
        int k,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        k=scanner.nextInt();
        System.out.print("Enter n:");
        n=scanner.nextInt();
        int x=k%n;
        System.out.println(x);
    }
}
