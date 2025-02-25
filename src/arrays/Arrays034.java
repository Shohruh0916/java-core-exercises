package arrays;

import java.util.Scanner;

public class Arrays034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n; i++){
            arr[i]=scanner.nextInt();
        }
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        double maxLocalMin = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 && arr[i] < arr[i + 1]) || (i == arr.length - 1 && arr[i] < arr[i - 1]) || (i > 0 && i < arr.length - 1 && arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                if (arr[i] > maxLocalMin) {
                    maxLocalMin = arr[i];
                        }
                    }
                }
                System.out.println( maxLocalMin);
    }
}
