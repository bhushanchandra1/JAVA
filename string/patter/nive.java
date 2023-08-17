package string.patter;
import java.util.*;
public class nive {
    public static ArrayList<Integer> pattern_search(String text , String pattern , int n , int m){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i <= (n-m);){
            int j ;
            for(j=0;j<m;j++){
                if(pattern.charAt(j)!=text.charAt(i+j)){
                    continue;
                }
                if(j==m){
                    list.add(i);
                }
                if(j==0){
                    i++;
                }
                else{
                    i = i+j+1 ;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s1 = "abcdabcd";
        String s2 = "ab";
        int n = s1.length();
        int m = s2.length();
        ArrayList<Integer> result = pattern_search(s1, s2, n, m);
        if(result.isEmpty()){
            System.out.println("It is empty");
        }
        else{
            System.out.println("Value : " + result);
        }
    }
    
}
