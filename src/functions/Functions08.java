package functions;

import java.util.Scanner;

public class Functions08 {
    public  static void Quarter(int x, int y){
        if(x>0 && y>0){
            System.out.println(1);
        }else if(x>0 && y<0){
            System.out.println(4);
        }else  if(x<0 && y>0){
            System.out.println(2);
        }else if(x<0 && y<0){
            System.out.println(3);
        }
    }
    public  static void Quarter(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        int x=scanner.nextInt();
        System.out.print("Enter y:");
        int y=scanner.nextInt();
        Quarter(x,y);

    }
    public static void main(String[] args) {
        Quarter();
    }
}
