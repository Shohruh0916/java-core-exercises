package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        double r;
        Scanner scanner=new Scanner(System.in);
        r=scanner.nextDouble();
        double l=2*Math.PI*r;
        double s=Math.PI*r*r;
        System.out.println("l="+l);
        System.out.println("s="+s);
    }
}
