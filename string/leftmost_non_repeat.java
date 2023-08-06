package string;

public class leftmost_non_repeat {
    final static int Char = 256;
    public static int lmnr(String s1 , int n){
        int[] count = new int[Char];
        for(int i = 0; i < n ;i++){
            count[s1.charAt(i)]++;
        }
        for(int i = 0 ;i < n;i++){
            if(count[s1.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "abbsdb";
        int n = s.length();
        System.out.println(lmnr(s, n));

    }
    
}
