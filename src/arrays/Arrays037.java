package arrays;
import java.util.Scanner;

public class Arrays037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n; i++){
            array[i]=scanner.nextInt();
        }
        int num=0;
       for(int i=0; i<n-1; i++){
           if(array[i]<=array[i+1]){
              num++;
           }
       }
        System.out.println(num);
    }
}
