
package string;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter str=");
        String str=scanner.nextLine();
        int num=0;
        for(int i=0; i<str.length(); i++){
            char s1=str.charAt(i);
            if(Character.isDigit(s1)){
                num++;
            }
        }
        System.out.println(num);
    }
}
