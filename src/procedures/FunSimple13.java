
package procedures;

import java.util.Scanner;

public class FunSimple13 {
    public static void SortDec3(double a, double b, double c){
        double min=a,max=b;
        if(min>b){
            min=b;
        }else if(min>c){
            min=c;
        }
        if(max<a){
            max=a;
        }else if(max<c){
            max=c;
        }
        double s1=a+b+c-min-max;
        System.out.println(max+" "+s1+" "+min);
    }public static void SortDec3(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a2:");
        double a2=scanner.nextDouble();
        System.out.print("Enter b2:");
        double b2=scanner.nextDouble();
        System.out.print("Enter c2:");
        double c2=scanner.nextDouble();
        System.out.print("Enter a1:");
        double a1=scanner.nextDouble();
        System.out.print("Enter b1:");
        double b1=scanner.nextDouble();
        System.out.print("Enter c1:");
        double c1=scanner.nextDouble();
        SortDec3(a2,b2,c2);
        SortDec3(a1,b1,c1);
    }
    public static void main(String[] args){
        SortDec3();
    }
}
