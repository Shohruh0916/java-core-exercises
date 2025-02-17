package foorloop;

import java.util.Scanner;

public class For25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        double result=0;
        for(int i=1; i<=n; i++){
            if(n%2!=0){
                double v = Math.pow(x, i) / i;
                result+=v;
            }else{
                double v = Math.pow(x, i) / i;
                result-=v;
            }
        }
        System.out.println(result);

    }
}

