package FoorLoop;

import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {
        int a;
        double s=0;
        int summa=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            s=Math.pow((a+i),2);
            summa+=s;
        }
        System.out.println(summa);
    }
}
