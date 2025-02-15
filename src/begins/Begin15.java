package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        double s;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter s:");
        s=scanner.nextDouble();
        double r=Math.sqrt(s/Math.PI);
        double d=2*r;
        System.out.println("r="+r);
        System.out.println("d="+d);
    }
}
