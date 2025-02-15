package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        double x1,y1,x2,y2,x3,y3;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1:");
        x1=scanner.nextDouble();
        System.out.print("Enter y1:");
        y1=scanner.nextDouble();
        System.out.print("Enter x2:");
        x2=scanner.nextDouble();
        System.out.print("Enter y2:");
        y2=scanner.nextDouble();
        System.out.print("Enter x3:");
        x3=scanner.nextDouble();
        System.out.print("Enter y3:");
        y3=scanner.nextDouble();
        double a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double b=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double c=Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("s="+s);
        System.out.println("p="+2*p);

    }
}
