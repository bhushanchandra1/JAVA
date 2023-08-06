package hashing;
import java.util.*;
class intersection{
    public static ArrayList<Integer> inter(int a[] , int b[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a.length ;i++){
            hs.add(a[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < b.length ; i++){
            if(hs.contains(b[i])){
                list.add(b[i]);
                hs.remove(b[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {10,15,20,15,30,30,5};
        int[] b = {30,5,30,80};

        ArrayList<Integer> intersectioResult = inter(a, b);
        System.out.println("Value : " + intersectioResult);
    }
}