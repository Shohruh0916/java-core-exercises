package cases;

import java.util.Scanner;

public class Cases07 {
    public static void main(String[] args) {
        double m;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m=");
        m=sc.nextDouble();
        System.out.println("og'irlik birligini bildiruvchi sonni kiriting (1-5) n:");
        n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println(m); break;
            case 2:
                System.out.println(m/1000000); break;
            case 3:
                System.out.println(m/1000); break;
            case 4:
                System.out.println(m*1000); break;
            case 5:
                System.out.println(m*100); break;
            default:
                System.out.println("Mavjud emas");
        }
    }
}
