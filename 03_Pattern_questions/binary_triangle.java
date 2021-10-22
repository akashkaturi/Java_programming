package Pattern_questions;

public class binary_triangle {
    public static void main(String[] args) {
        int sum = 0;
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
                System.out.print(sum % 2+ " ");
            }
            System.out.println();
        }
    }
}
