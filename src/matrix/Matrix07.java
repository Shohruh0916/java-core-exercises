package matrix;

import java.util.Scanner;

public class Matrix07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=scanner.nextInt();
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
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
        if(k>=0 && k<m){
                for(int j=0; j<n; j++){
                    System.out.print(matrix[k][j]+"\t");
                }
        }else{
            System.out.println("error");
        }

    }
}
