package foorloop;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter :");
        a=scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i+" kg"+"="+i*a+" so'm");
        }
    }
}
