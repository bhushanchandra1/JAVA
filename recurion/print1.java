package recurion;
import java.util.*;
public class print1 {
    public static void printing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range - ");
        int n = sc.nextInt();
        printing(n);
        sc.close();
    }
    
}
