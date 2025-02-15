package FoorLoop;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        int y=1;
        for(int i=a; i<=b; i++){
            y*=i;
        }
        System.out.println(y);
    }
}
