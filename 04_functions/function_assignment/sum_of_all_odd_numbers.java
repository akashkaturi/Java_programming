package functions.function_assignment;

import java.util.*;

public class sum_of_all_odd_numbers {
    public static int sum(int n) {
        int sum = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            sum += num;
            num += 2;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The sum of first n natural numbers is: ");
        System.out.println(sum(n));
        sc.close();
    }
}
