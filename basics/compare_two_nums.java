package basics;

import java.util.*;
public class compare_two_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("A is equal to B");
        }
        else if (a > b) {
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("A is less than B");
        }
        sc.close();
    }
}