package Pattern_questions;

public class flip_right_triangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                if(j<=n-i){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
                // _ _ _ _ *
                // _ _ _ * *
            }
            System.out.println();
        }
    }
}
