package ifelse;

import java.util.Scanner;

public class IfElse29 {
    public static void main(String[] args) {
        int x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextInt();
        if(x>0 && x%2==0){
            System.out.println("Musbat juft!");
        }else if(x>0){
            System.out.println("Musbat toq!");
        }else if(x<0 && x%2==0){
            System.out.println("Manfiy juft!");
        }else if(x<0 && x%2!=0){
            System.out.println("Manfiy toq!");
        }else{
            System.out.println(0);
        }
    }
}
