package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.println(Math.pow(a,2));
        System.out.println(Math.pow(a,3));
        System.out.println(Math.pow(a,5));
        System.out.println(Math.pow(a,10));
        System.out.println(Math.pow(a,15));

    }
}
