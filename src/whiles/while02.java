package whiles;

import java.util.Scanner;

public class while02 {
    public static  void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        int sanoq=0;
        while(a>b){
            a-=b;
            sanoq++;
        }
        System.out.println("result:"+sanoq);
    }
}
