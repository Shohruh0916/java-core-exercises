package arrays;
import java.util.Scanner;

public class Arrays036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n; i++){
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        System.out.println();
        System.out.println("Lokal maximum:");
        for (int i = 2; i < n; i++) {
            if(array[i]<array[i-1]&&array[i-2]<array[i-1]){
                System.out.print(array[i-1]+" ");
            }else {
                if(max<array[i-1]){
                    max=array[i-1];
                }
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
