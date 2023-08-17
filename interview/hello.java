package interview;
import java.util.*;

public class hello {
    public static int sum(int[] arr){
        int n = arr.length;
        int sum = 0 ;
        for(int i = 0; i < n ;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size5 : " );
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
        sc.close();
    }
    
}
