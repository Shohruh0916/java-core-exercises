package begins;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        double x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextDouble();
        double function=4*Math.pow((x-3),6)-7*Math.pow((x-3),3)+2;
        System.out.println("result:"+function);
    }
}
