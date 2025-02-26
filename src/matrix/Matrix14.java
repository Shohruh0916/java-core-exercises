package matrix;

import java.util.Scanner;

public class Matrix14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=scanner.nextInt();
        int [][] matrix=new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=i*m+j+1;
            }
        }
        for(int i=0; i<m; i++ ){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < m; j++) {
           for(int i=0; i<m-j; i++){
               System.out.print(matrix[i][j]+" ");
           }
           for(int i=j+1; i<m; i++){
               System.out.print(matrix[m-1-j][i]+" ");
           }
        }
    }
}
