package Pattern_questions;

public class Floyds_Triangle {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
