package functions;

import java.util.Scanner;

public class Functions01 {
    public static  void Sign(double x){
        if(x<0){
            System.out.println(-1);
        }else if(x==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    public static  void Sign(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        Sign(a);
        Sign(b);
    }

    public static void main(String[] args) {
        Sign();
    }
}
