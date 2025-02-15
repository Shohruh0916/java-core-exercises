package While;

import java.util.Scanner;

public class while03 {
    public static  void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        System.out.print("Enter k:");
        k=sc.nextInt();
        while(n>k){
            n-=k;
        }
        System.out.println("result:"+n);
    }
}
