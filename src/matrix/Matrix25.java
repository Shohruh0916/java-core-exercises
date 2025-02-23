package matrix;

import java.util.Scanner;

public class Matrix25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=scanner.nextInt();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        int [][] matrix=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        double maxSum = Double.NEGATIVE_INFINITY;
        int maxRowIndex = -1;
        for (int i = 0; i < m; i++) {
            double rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println( rowSum);
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRowIndex = i;
            }
            System.out.println( (maxRowIndex + 1));
            System.out.println( maxSum);
        }
    }
}
