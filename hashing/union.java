package hashing;

import java.util.ArrayList;
import java.util.HashSet;

class union{
    public static ArrayList<Integer> unionnumber(int a[] , int b[]){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> a1 = new HashSet<>();
        //HashSet<Integer> a2 = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            a1.add(a[i]);
        }
        for(int i = 0 ;i < b.length ;i++){
            a1.add(b[i]);
        }
        for(Integer i : a1){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {15,20,5,15,15};
        int[] b = {15,15,20,10};
        ArrayList<Integer> x = unionnumber(a, b);
        System.out.println("Answer = " + x );

    }

}