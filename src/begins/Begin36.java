package begins;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        double v1,v2,t;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter v1:");
        v1=scanner.nextDouble();
        System.out.print("Enter v2:");
        v2=scanner.nextDouble();
        System.out.print("Enter t:");
        t=scanner.nextDouble();
        double s=(v1+v2)*t;
        System.out.println(s);

    }
}
