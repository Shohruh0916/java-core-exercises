
package string;

import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.print("Enter s1:");
        String s1=scanner.nextLine();
        System.out.print("Enter n1:");
        int n1=scanner.nextInt();
        System.out.print("Enter s2:");
        String s2=scanner1.nextLine();
        System.out.print("Enter n2:");
        int n2=scanner1.nextInt();
        String str=s1.substring(0,n1);
        String str1=s2.substring(s2.length()-n2);
        String result=str+str1;
        System.out.println(result);

    }
}
