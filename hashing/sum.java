package hashing;

import java.util.*;

public class sum{
    public static boolean sumed(int[] arr ,int n, int s){
        HashSet<Integer> x = new HashSet<>();

        for(int i = 0; i < n ;i++){
            x.add(arr[i]);
        }

        for(int i = 0 ;i < n ;i++){
            if(x.contains(s - arr[i])){
                return true;
            }
            x.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,8,15,-8};
        int sume = 21;
        int n = arr.length;
        System.out.println(sumed(arr , n , sume));
    }
}