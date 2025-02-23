package matrix;

import java.util.Scanner;

public class Matrix24 {
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
        int max=0;
        for(int j=0; j<n; j++){
            max=matrix[0][j];
            for(int i=1; i<m; i++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
