package begins;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.println(Math.pow(a,2));
        System.out.println(Math.pow(a,4));
        System.out.println(Math.pow(a,8));
    }
}
