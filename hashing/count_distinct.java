package hashing;

import java.util.*;
class count_distinct{
    public static int count(int[] arr ,int n){
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < n ;i++){
            hs.add(arr[i]);
        }
        int res = 0;
        for(int i = 0 ;i < n ;i++){
            if(hs.contains(arr[i]-1)==false){
                count = 1;
                while (hs.contains(arr[i]+count)) {
                    count++;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,2,7,4,3,8};
        int n = arr.length;
        int ans = count(arr, n);
        System.out.println(ans);
    }
}