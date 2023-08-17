package string;
import java.util.*;
public class simple {
    public static boolean palondrom(String s){
        int n = s.length();
        for(int i = 0; i < n/2 ;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = palondrom(s);
        System.out.println("so the ans is " + ans);
        sc.close();
    }
    
}
