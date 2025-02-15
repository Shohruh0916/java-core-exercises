package integers;

import java.util.Scanner;

public class Integers01 {
    public static void main(String[] args) {
        int l;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter l:");
        l=scanner.nextInt();
        int result=l/100;
        System.out.println("result:"+result);
    }
}
