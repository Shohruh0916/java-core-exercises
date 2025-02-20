
package procedures;

import java.util.Scanner;

public class FunSimple08 {
    public static void AddRightDigit(int k, int r){
        System.out.print(k+""+r);
    }
    public static void AddRightDigit(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        System.out.print("Enter r:");
        int r=scanner.nextInt();
        AddRightDigit(k,r);
    }
    public static void main(String[] args){
        AddRightDigit();
    }
}
