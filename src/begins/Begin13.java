package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        double r1,r2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter r1:");
        r1=scanner.nextDouble();
        System.out.print("Enter r2:");
        r2=scanner.nextDouble();
        double s1=Math.PI*Math.pow(r1,2);
        double s2=Math.pow(r2,2)*Math.PI;
        double s3=s1-s2;
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
    }
}
