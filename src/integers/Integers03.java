package integers;

import java.util.Scanner;

public class Integers03 {
    public static void main(String[] args) {
        int bayte;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter l:");
        bayte=scanner.nextInt();
        int result=bayte/1024;
        System.out.println("result:"+result);
    }
}
