package recursion_class2;


public class removedup {
    public static boolean arr[] = new boolean[26];
    public static void remove(String str , int idx , String strnew){
        if(idx == str.length()){
            System.out.println(strnew);
            return;
        }

        if(arr[str.charAt(idx) - 'a'] == true){
            remove(str, idx+1, strnew);
        }
        else{
            strnew += str.charAt(idx);
            arr[str.charAt(idx) - 'a'] = true;
            remove(str, idx+1, strnew);

        }
    }
    public static void main(String[] args) {
        String str = "aabsdebbs";
        remove(str, 0, "");
    }

}