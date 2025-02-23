package matrix;

import java.util.Scanner;

public class Matrix11 {
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
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
