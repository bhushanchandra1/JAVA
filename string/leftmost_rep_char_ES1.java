package string;
import java.util.*;
public class leftmost_rep_char_ES1 {
    static final int Char = 256;
    public static int leftmost(String s1 , int n){
        int[] fname = new int[Char];
        Arrays.fill(fname , -1);
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n ;i++){
            int fi = fname[s1.charAt(i)];
            if(fi == -1){
                fname[s1.charAt(i)] = i;
            }
            else{
                res = Math.min(res, fi);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
        //---------------OR--------------
        // if(res == Integer.MAX_VALUE){
        //     return -1;
        // }
        // else{
        //     return res;
        // }
    }

    public static void main(String[] args) {
        String s1 = "abccbd";
        int n = s1.length();
        System.out.println(leftmost(s1, n));

    }
}
