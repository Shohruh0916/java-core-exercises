package cases;

import java.util.Scanner;

public class Cases08 {
    public static void main(String[] args) {
        int d,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter d=");
        d=sc.nextInt();
        System.out.print("Enter m=");
        m=sc.nextInt();
        int day = 0;
        if(m>=1 && m<=12){
            day = switch (m) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> 0;
            };
        }else{
            System.out.println("Noto'g'ri oy");
        }
        if(d<1 || d>day){
            System.out.println("Noto'g'ri kun");
        }else{
            System.out.println(d+"\\"+m);
        }
    }
}
