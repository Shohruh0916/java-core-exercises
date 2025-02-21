package functions;

import java.util.Scanner;

public class Functions05 {
    public  static  void SumRange(int a, int b){
        int sum=0;
        if(a<b){
            for(int i=a; i<b; i++){
                sum+=i;
            }
        }else{
            System.out.println(0);
        }
        System.out.println(sum);
    }
    public  static  void SumRange(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        System.out.print("Enter c:");
        int c=scanner.nextInt();
        SumRange(a,b);
        SumRange(b,c);
    }
    public static void main(String[] args) {
        SumRange();
    }
}
