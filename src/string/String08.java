package string;

import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("s=");
        char s=scanner.next().charAt(0);
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(s);
        }
    }
}
