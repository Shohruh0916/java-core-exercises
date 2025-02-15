package While;

import java.util.Scanner;

public class while01 {
    public static  void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        while(a>b){
            a-=b;
        }
        System.out.println("result:"+a);
    }
}
