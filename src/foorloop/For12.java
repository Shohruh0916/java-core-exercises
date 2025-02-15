package foorloop;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        double s=1.1;
        double y=1.0;
        for(double i=1.1; i<=(1.1+0.1*n); i+= 0.1){
            y*=i;
        }
        System.out.println(y);
    }
}
