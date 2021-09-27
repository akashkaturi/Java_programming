package functions.function_assignment;

import java.util.*;

public class greatest_of_two {
    public static int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("The greatest among two numbers is: ");
        System.out.println(greatest(a, b));
        sc.close();
    }
}
