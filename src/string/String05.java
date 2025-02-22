package string;

import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        if(n>=1 && n<=26 ){
            for(int i=0; i<n; i++){
                System.out.print((char) ('z'-i)+" ");
            }
        }else{
            System.out.println("1-26 oraliqda son kiriting!");
        }
    }
}
