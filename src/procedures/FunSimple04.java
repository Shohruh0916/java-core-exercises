
package procedures;

import java.util.Scanner;

public class FunSimple04 {
    public  static  void Triangle(double a){
        double result=Math.sqrt(3)*Math.pow(a,2)/4;
        System.out.println(result);
    }
    public static void Triangle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        Triangle(a);
    }
    public static void main(String[] args) {
        Triangle();
    }
}
