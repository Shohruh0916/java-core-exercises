package While;

import java.util.Scanner;

public class while06 {
    public static  void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int result=1;
        int s=n;
        while(s>0){
            result*=s;
            s-=2;
        }
        System.out.println(result);
    }
}
