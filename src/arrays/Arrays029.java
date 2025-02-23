package arrays;

import java.util.Scanner;

public class Arrays029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max=array[0];
        for(int i=1; i<n; i+=2){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
