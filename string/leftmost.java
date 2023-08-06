package string;

public class leftmost{
    static final int Char = 256;
    public static int lrc(String s , int n){
        int[] count = new int[Char];
        for(int i = 0 ; i < n ; i++){
            count[s.charAt(i)]++;
        }
        for(int i = 0 ;i < n ; i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "abccdda";
        int n = s1.length();
        System.out.println(lrc(s1,n));
    }
}