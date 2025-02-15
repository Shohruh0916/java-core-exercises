package begins;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1:");
        x1=scanner.nextDouble();
        System.out.print("Enter y1:");
        y1=scanner.nextDouble();
        System.out.print("Enter x2:");
        x2=scanner.nextDouble();
        System.out.print("Enter y2:");
        y2=scanner.nextDouble();
        double result=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("result:"+result);
    }
}
