package recursion_class2;

public class occerencefl {
    public static int first = -1;
    public static int last = -1;
    public static void occerf_l(String sc , int idx , char element){
        if(idx == sc.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(sc.charAt(idx) == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occerf_l(sc, idx+1, element);
    }
    public static void main(String[] args) {
        String sc = "abccbaaez";
        occerf_l(sc, 0, 'b');
    }
    
}
