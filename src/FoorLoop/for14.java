package FoorLoop;

import java.util.Scanner;

public class for14 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        int result=0;
        for(int i=1; i<=2*n-1; i+=2){
            result += i;
        }
        System.out.println(result);
    }
}
