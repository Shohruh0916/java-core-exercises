

package string;

import java.util.Scanner;

public class String20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter str:");
        String str=scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            char s=str.charAt(i);
            if(Character.isDigit(s)){
                System.out.println(s);
            }
        }
    }
}
