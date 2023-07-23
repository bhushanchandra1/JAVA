package hashing;

import java.util.*;

public class unioOfTwoarr{
    public static int sized(int[] a, int[] b){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0 ;i < a.length ;i++){
            num.add(a[i]);
        }
        for(int i = 0 ;i < b.length ;i++){
            num.add(b[i]);
        }
        return num.size();
    }
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};
        System.out.println(sized(a,b));
    }
}