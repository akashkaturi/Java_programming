package functions.function_assignment;
import java.util.*;

public class average_of_3_numbers {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("The average of given 3 numbers is: ");
        System.out.println(avg(a, b, c));
        sc.close();
    }

}
