package matrix;

import java.util.Scanner;

public class Matrix06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=scanner.nextInt();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        System.out.print("Enter d:");
        int d=scanner.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            matrix[i][0]=d;
        }
        for(int j=1; j<n; j++){
            for(int i=0; i<m; i++){
                matrix[i][j]=matrix[i][j-1]*d;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
