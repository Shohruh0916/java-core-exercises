package FoorLoop;

import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        double s1=1.1;
        double result=0.0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                result+=s1;
                s1+=0.1;
            }else{
                result-=s1;
                s1+=0.1;
            }
        }
        System.out.println(result);
    }
}
