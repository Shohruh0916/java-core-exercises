package integers;

import java.util.Scanner;

public class Integers09 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        int result=a/100%10;
        System.out.println("result:"+result);
    }
}
