package cases;

import java.util.Scanner;

public class Cases03 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        switch(n){
            case 12:
            case 1:
            case 2:
                System.out.println("Qish"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Bahor"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("yoz"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Kuz"); break;
            default:
                System.out.println("Bunday oyga tegishli fasl yoq");
        }
    }
}
