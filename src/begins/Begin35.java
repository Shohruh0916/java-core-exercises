package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        double v,u,t1,t2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter v:");
        v=scanner.nextDouble();
        System.out.print("Enter u:");
        u=scanner.nextDouble();
        System.out.print("Enter t1:");
        t1=scanner.nextDouble();
        System.out.print("Enter t2:");
        t2=scanner.nextDouble();
        double s=((u+v)*t1+(v-u)*t2)/2;
        System.out.println(s);


    }
}
