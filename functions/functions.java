package functions;

import java.util.*;

class functions {
    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateFactorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of two numbers is " + calculateSum(a, b));
        System.out.println("The product of two numbers is " + calculateProduct(a, b));
        int c = sc.nextInt();
        System.out.println("The factorial of the number "+ c +" is "+calculateFactorial(c));

        sc.close();
    }
}