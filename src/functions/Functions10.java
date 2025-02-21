package functions;

import java.util.Scanner;

public class Functions10 {
    public  static void IsSquare(int k){
        int sqrt = (int) Math.sqrt(k);
        if(sqrt * sqrt == k){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public  static  void  IsSquare(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        IsSquare(k);
    }
    public static void main(String[] args) {
        IsSquare();
    }
}
