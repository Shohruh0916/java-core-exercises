
package string;

import java.util.Scanner;

public class String26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter str:");
        String str=scanner.nextLine();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        String str1="";
        if(str.length()>n){
             str1=str.substring((str.length()-n));
        }else{
             str1="."+str;
        }
        System.out.println(str1);
    }
}
