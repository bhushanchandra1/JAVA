package hashing;
import java.util.*;
class check{
    public static void main(String[] args) {
        String s = "aanad";
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<s.length() ;i++){
            if(s.charAt(i) == 'a'){
                hs.add(i);
            }
        }
        
        System.out.println(hs);
    }
}