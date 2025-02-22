package string;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter s1=");
        String s1=scanner.nextLine();
        for(int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }
    }
}
