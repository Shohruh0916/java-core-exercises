package cases;

import java.util.Scanner;

public class Cases06 {
    public static void main(String[] args) {
        double l;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("l=");
        l=sc.nextDouble();
        System.out.println("uzunlik birligini bildiruvchi sonni kiriting (1-5) n:");
        n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println(l/10); break;
            case 2:
                System.out.println(l*1000); break;
            case 3:
                System.out.println(l); break;
            case 4:
                System.out.println(l/1000); break;
            case 5:
                System.out.println(l/100); break;
            default:
                System.out.println("Mavjud emas");
        }
    }
}
