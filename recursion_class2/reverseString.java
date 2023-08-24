package recursion_class2;

public class reverseString {
    public static void reversey(String str , int n){
        if(n==0){
            System.out.println(str.charAt(n));
            return;
        }
        System.out.println(str.charAt(n));
        reversey(str , n-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reversey(str , str.length()-1);


    }
}
