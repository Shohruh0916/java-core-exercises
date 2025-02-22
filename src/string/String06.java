package string;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("s=");
        char s=scanner.next().charAt(0);
        if(Character.isDigit(s)){
            System.out.println("digit");
        }else if(Character.isUpperCase(s)){
            System.out.println("lotin katta harf");
        }else if(Character.isLowerCase(s)){
            System.out.println("lotin kichik harf");
        }else{
            System.out.println("nol");
        }
    }
}
