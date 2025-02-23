package arrays;

import java.util.Scanner;

public class Arrays026 {
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
        for(int i=0; i<n-1; i++){
            if((array[i]%2==0 && array[i+1]%2==0) || (array[i]%2!=0 && array[i+1]%2!=0 ) ){
                System.out.println(i+2);
                return;
            }
        }
        System.out.println(0);
    }
}
