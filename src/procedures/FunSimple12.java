
package procedures;

import java.util.Scanner;

public class FunSimple12 {
    public static void SortInc3(double a, double b, double c){
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
        System.out.println(min+" "+s1+" "+max);

    }public static void SortInc3(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter c:");
        double c=scanner.nextDouble();
        System.out.print("Enter a1:");
        double a1=scanner.nextDouble();
        System.out.print("Enter b1:");
        double b1=scanner.nextDouble();
        System.out.print("Enter c1:");
        double c1=scanner.nextDouble();
        SortInc3(a,b,c);
        SortInc3(a1,b1,c1);
    }
    public static void main(String[] args){
        SortInc3();
    }
}
