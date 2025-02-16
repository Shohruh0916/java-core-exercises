package integers;

import java.util.Scanner;

public class Integers26 {
    public static void main(String[] args) {
        int k;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        k=scanner.nextInt();
        int x=k%7+1;
        System.out.println(x);


    }
}
