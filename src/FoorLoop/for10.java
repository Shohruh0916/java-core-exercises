package FoorLoop;

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        int a;
        double s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            s+=1.0/i;
        }
        System.out.println(s);
    }
}
