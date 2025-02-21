package functions;

import java.util.Scanner;

public class Functions09 {
    public  static void Even(int k){
        boolean result= k%2==0;
        System.out.println(result);
    }
    public  static void Even(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        Even(k);
    }
    public static void main(String[] args) {
        Even();
    }
}
