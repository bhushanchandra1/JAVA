package hashing;

class prefix{
    public static void pre(int[] nums){
        int n = nums.length;
        for(int i = 1 ;i < n; i++){
            nums[i] = nums[i]+nums[i-1];
        }
    }
    public static void main(String[] args) {
        int arr[] = {-3 , 4 ,-3 ,1,-1};
        pre(arr);
        for(int i = 0; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
        
    }
}