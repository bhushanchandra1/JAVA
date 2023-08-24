package recursion_class2;

public class sorted_arr {
    public static boolean sorted_arrr(int[] arr , int idx){
        if(idx == arr.length -1){
            return true;
        }

        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        return sorted_arrr(arr , idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        System.out.println(sorted_arrr(arr, 0));

    }
}
