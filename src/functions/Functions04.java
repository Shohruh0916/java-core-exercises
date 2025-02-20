package functions;

import java.util.Scanner;

public class Functions04 {
    public  static  void RingS(double r1, double r2){
        double s=Math.PI*(Math.pow(r1,2)-Math.pow(r2,2));
        System.out.println(s);
    }
    public  static  void RingS(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter r1:");
        double r1=scanner.nextDouble();
        System.out.print("Enter r2:");
        double r2=scanner.nextDouble();
        RingS(r1,r2);
    }
    public static void main(String[] args) {
        RingS();
    }
}
