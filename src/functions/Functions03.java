package functions;

import java.util.Scanner;

public class Functions03 {
    public  static void Circle(double r){
        double s=Math.PI*Math.pow(r,2);
        System.out.println(s*3);
    }
    public  static void Circle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter r:");
        double r=scanner.nextDouble();
        Circle(r);
    }
    public static void main(String[] args) {
        Circle();
    }
}
