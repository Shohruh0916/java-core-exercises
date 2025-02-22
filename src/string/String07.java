package string;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("s=");
        String str=scanner.nextLine();
        if(!str.isEmpty()){
            String s1=str.substring(0,1);
            String s2=str.substring(str.length()-1);
            char s3=str.charAt(0);
            System.out.println((int) s3);
            char s4=s2.charAt(0);
            System.out.println((int) s4);
        }
    }
}
