package arrays;

import java.util.Scanner;

public class Arrays019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        int lastElement = a[9],firstElement=a[0];
        int result=0;
        for(int i=0; i<10 ;i++){
            if(firstElement<a[i] && lastElement>a[i]){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}