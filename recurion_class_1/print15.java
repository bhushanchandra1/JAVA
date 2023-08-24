package recurion_class_1;

import java.util.Scanner;

public class print15 {
    public static void printi(int n , int x ){
        if(n == x+1){
            return ;
        }
        System.out.println(n);
        printi(n+1, x);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range from - ");
        int n = sc.nextInt();
        System.out.print("Enter range to - ");
        int x = sc.nextInt();
        printi(n, x);
        sc.close();

    }
}
