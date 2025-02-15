package integers;

import java.util.Scanner;

public class Integers02 {
    public static void main(String[] args) {
        int m;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter l:");
        m=scanner.nextInt();
        int result=m/1000;
        System.out.println("result:"+result);
    }
}
