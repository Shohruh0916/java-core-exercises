package string;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter str=");
        String str=scanner.next();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
        }
    }
}
