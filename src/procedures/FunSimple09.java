
package procedures;

import java.util.Scanner;

public class FunSimple09 {
    public static void AddLeftDigit(int k, int r){
        System.out.print(r+""+k);
    }
    public static void AddLeftDigit(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        System.out.print("Enter r:");
        int r=scanner.nextInt();
        AddLeftDigit(k,r);
    }
    public static void main(String[] args){
        AddLeftDigit();
    }
}
