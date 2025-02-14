package FoorLoop;

import java.util.Scanner;

public class for22 {
    public static void main(String[] args) {
        int n;
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        System.out.print("Enter x:");
        x=sc.nextDouble();
        int s=1;
        double result=0.0;
        for(int i=1; i<=n; i++){
            s*=i;
            result+=Math.pow(x,i)/s;
        }
        System.out.println(result+1);
    }
}
