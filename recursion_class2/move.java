package recursion_class2;

public class move {
    public static void moveAll(String str , int idx , int count , String newstr){
        if(idx == str.length()){
            for(int i = 0 ;i <count ;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx)=='x'){
            moveAll(str, idx+1, count+1, newstr);
        }
        else{
            newstr += str.charAt(idx);
            moveAll(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axsxdfgxh";
        moveAll(str, 0, 0, "");

    }
    
}
