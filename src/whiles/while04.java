package whiles;

import java.util.Scanner;

public class while04 {
    public static  void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int y=1;
        while(y<n){
            y*=3;
        }
        if(y==n){
            System.out.println(n+" 3 ning darjasi");
        }else{
            System.out.println("Darajasi emas!");
        }
    }
}
