

package string;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter str:");
        String str=scanner.nextLine();
        int sum=0;
        for(int i=0; i<str.length(); i++){
            char s=str.charAt(i);
            if(Character.isDigit(s)){
                int x=s;
                sum+=x-'0';
            }
        }
        System.out.println(sum);
    }
}
