

package string;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter str:");
        String str=scanner.nextLine();
        for(int i=str.length()-1; i>=0; i--){
            char s=str.charAt(i);
            if(Character.isDigit(s)){
                System.out.print(s+" ");
            }
        }
    }
}
