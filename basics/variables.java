package basics;

import java.util.*;

public class variables {
    public static void main(String[] args) {
        // variables
        String name = "Tony Stark";
        int age = 48;
        double weight = 78.5;
        int a = 10;
        int b = 5;
        int sum = a / b * a - b;
        System.out.println(name + " Age: " + age + " Weight: " + weight);
        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println("hey lovely girl " + input);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int ans = k + l;
        System.out.println(ans);
        sc.close();

    }
}
