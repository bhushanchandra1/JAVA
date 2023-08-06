package array;

public class movezero{

    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,0,4};
        int nums[] = new int[arr.length];
        int j = 0;
        for(int i = 0;i < arr.length ;i++)
        {
            if(arr[i] == 0){
                continue;
            }
            nums[j] = arr[i];
            j++;
        }
        
        for(int i = j ;i <arr.length;i++){
            nums[i] = 0;
        }

        for(int i = 0 ;i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}