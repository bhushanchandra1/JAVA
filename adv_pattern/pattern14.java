package adv_pattern;

public class pattern14{
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int sum = 2*i-1;

            for(int j =1;j<=sum;j++){
                System.out.print("+");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int sum = 2*i-1;

            for(int j =1;j<=sum;j++){
                System.out.print("+");
            }

            System.out.println();
        }
    }
}