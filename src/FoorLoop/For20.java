package FoorLoop;

import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int result=0;
        int s=1;
        for(int i=1; i<=n; i++){
            s*=i;
            result+=s;
        }
        System.out.println(result);
    }
}
