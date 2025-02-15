package FoorLoop;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        int n,k;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        n=scanner.nextInt();
        System.out.print("Enter k:");
        k=scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
        }
    }

}
