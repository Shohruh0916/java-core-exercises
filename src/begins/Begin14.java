package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        double l;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter l:");
        l=scanner.nextDouble();
        double r=l/Math.PI*2;
        double s=Math.PI*r*r;
        System.out.println("r="+r);
        System.out.println("s="+s);
    }
}
