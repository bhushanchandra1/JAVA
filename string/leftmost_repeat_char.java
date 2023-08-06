package string;

public class leftmost_repeat_char {
    final static int Char = 256;
    public static int lmrc(String s , int n ){
        int res = -1;
        boolean[] visited = new boolean[Char];
        for(int i = n-1 ;i > 0;i--){
            if(visited[s.charAt(i)]){
                res = i;
            }
            else{
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "aabbcacbd";
        int n = s.length();
        System.out.println(lmrc(s, n));
    }
}
