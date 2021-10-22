package functions.function_assignment;

import java.util.*;

public class Circumference {
    static double pi=3.14;

    public static double circle(float r) {
        return 2 * pi * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.print("The circumference of circle is: ");
        System.out.println(circle(r));
        sc.close();
    }
}
