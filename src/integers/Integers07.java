package integers;

import java.util.Scanner;

public class Integers07 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        int x=a/10%10;
        int y=a%10;
        int result=x+y;
        System.out.println("result:"+result);
    }
}
