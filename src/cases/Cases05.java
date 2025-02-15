package cases;

import java.util.Scanner;

public class Cases05 {
    public static void main(String[] args) {
        double a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Amallardan birini kiriting (1->+, 2->-, 3->/, 4->*) c: ");
        c=sc.nextInt();
        System.out.print("Enter a=");
        a=sc.nextDouble();
        System.out.print("Enter b=");
        b=sc.nextDouble();
        switch(c){
            case 1:
                System.out.println(a+b); break;
            case 2:
                System.out.println(a-b); break;
            case 3:
                System.out.println(a/b); break;
            case 4:
                System.out.println(a*b); break;
            default:
                System.out.println("Bunday amal mavjud emas");
        }
    }
}
