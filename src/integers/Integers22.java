package integers;

import java.util.Scanner;

public class Integers22 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        n=scanner.nextInt();
        int time=n/3600%60;
        int time2=n%60;
        System.out.println(time);
        System.out.println(time2);

    }
}
