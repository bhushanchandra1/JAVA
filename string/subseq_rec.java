package string;

public class subseq_rec{
    public static boolean sub(String s1 , String s2 , int n , int m){
        
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return sub(s1,s2,n-1,m-1);
        }
        else{
            return sub(s1,s2,n-1,m);
        }
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ab";
        int n = s1.length();
        int m = s2.length();
        System.out.println(sub(s1, s2,n,m));

    }
}