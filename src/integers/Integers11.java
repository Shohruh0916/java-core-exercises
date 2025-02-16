package integers;

import java.util.Scanner;

public class Integers11 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a=scanner.nextInt();
        int z=a/100%10;
        int x=a/10%10;
        int y=a%10;
        int sum=x+y+z;
        System.out.println(sum);
    }
}
