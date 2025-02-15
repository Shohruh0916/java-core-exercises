package While;

import java.util.Scanner;

public class while05 {
    public static  void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int y=1;
        int daraja=0;
        while(y<n){
            y*=2;
            daraja++;
        }
        if(y==n){
            System.out.println(n+" 2 ning "+daraja+"-darajasi");
        }else{
            System.out.println("2 ning darajasi emas!");
        }
    }
}
