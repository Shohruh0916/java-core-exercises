package arrays;
import java.util.Scanner;

public class Arrays040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n; i++){
            array[i]=scanner.nextInt();
        }
        System.out.print("Enter r:");
        int r=scanner.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=1; i<n-1; i++){
            if((array[i]-r)<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
