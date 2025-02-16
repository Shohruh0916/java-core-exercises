package integers;

import java.util.Scanner;

public class Integers19 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        n=scanner.nextInt();
        int time=n/60%60;
        System.out.println("time:"+time);

    }
}
