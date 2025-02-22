package string;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter s1=");
        String s1=scanner.next();
        for(int i=0; i<s1.length(); i++){
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
