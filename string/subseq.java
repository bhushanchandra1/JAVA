package string;
public class subseq{
    public static boolean subsequnce(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();
        int j = 0;
        for(int i = 0; i < n && j < m ;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cda";
        System.out.println(subsequnce(s1, s2));
    }
}