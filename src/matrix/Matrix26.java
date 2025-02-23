package matrix;

import java.util.Scanner;

public class Matrix26 {
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
        double minProduct = Double.POSITIVE_INFINITY;
        int minColumnIndex = -1;
        for (int j = 0; j < n; j++) {
            double columnProduct = 1.0;
            for (int i = 0; i < m; i++) {
                columnProduct *= matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " product: " + columnProduct);
            if (columnProduct < minProduct) {
                minProduct = columnProduct;
                minColumnIndex = j;
            }
        }
        System.out.println((minColumnIndex + 1));
        System.out.println( minProduct);

    }

}
