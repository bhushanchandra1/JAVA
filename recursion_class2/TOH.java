package recursion_class2;

public class TOH {
    public static void towerOH(int n , String scr , String helper , String dec){
        if(n==1){
            System.out.println(n + scr + dec);
            return;
        }

        towerOH(n-1, scr, dec , helper);
        System.out.println(n +  scr  + dec);
        towerOH(n-1, helper, scr, dec);
    }
    public static void main(String[] args) {
        int n = 2;
        towerOH(n , "S" , "H", "D");
    }
}
