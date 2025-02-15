package FoorLoop;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        int n;
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        System.out.print("Enter a:");
        a=sc.nextDouble();
        double result=1;
        for(int i=1; i<=n; i++){
            result=Math.pow(a,i);
            System.out.println(a+" ning "+i+" - darajasi "+result);
        }
    }
}
