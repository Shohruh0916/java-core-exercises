package arrays;
import java.util.Scanner;

public class Arrays035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n; i++){
            arr[i]=scanner.nextInt();
        }
       int min= Integer.MAX_VALUE;
        for(int i=2; i<n; i++){
            if(arr[i]<arr[i-1] && arr[i-2] <arr[i-1]){
                if(arr[i]<min){
                    System.out.println(arr[i-1]);
                    min=arr[i];
                }
            }
        }
        System.out.println(min);
    }
}
