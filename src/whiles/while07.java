package whiles;

import java.util.Scanner;

public class while07 {
    public static  void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int k=1;
        while(k*k<n){
            k++;
        }
        System.out.println(k);
    }
}
