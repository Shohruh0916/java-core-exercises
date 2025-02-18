package whiles;

import java.util.Scanner;

public class while10 {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt(),k=3,i=1,pow=1;
        while(k<=n){
            pow=i;
            i++;
            k*=3;
        }
        System.out.println(pow);
    }
}
