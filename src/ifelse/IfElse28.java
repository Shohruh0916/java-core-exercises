package ifelse;

import java.util.Scanner;

public class IfElse28 {
    public static void main(String[] args) {
        int x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x:");
        x=scanner.nextInt();
        if((x%4==0 || x%100==0) && x%400!=0){
            System.out.println(366);
        }else{
            System.out.println(365);
        }
    }
}
