package string;

import java.util.Scanner;

public class alphanumer {
    public static String numerical(String str){
        String result = "";
        for(int i = 0 ;i  < str.length() ;i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                result= result+i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = numerical(str);
        System.out.println(s);
        sc.close();

    }
    
}
