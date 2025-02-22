package string;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        if(n>32 && n<=126){
            char s=(char) n;
            System.out.println(s);
        }else{
            System.out.println("no");
        }
    }
}
