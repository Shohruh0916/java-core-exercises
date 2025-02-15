package FoorLoop;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter :");
        a=scanner.nextInt();
        System.out.print("Enter b:");
        b=scanner.nextInt();
        for(int i=a; i<=b; i++){
            System.out.print(i+" ");
        }
    }
}
