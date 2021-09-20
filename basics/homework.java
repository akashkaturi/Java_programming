package basics;

import java.util.*;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("***Welcome to the miniation Calculator***");
        while (repeat) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter the Operation: ");
            String s = sc.next();
            char c = s.charAt(0);
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            switch (c) {
                case '+':
                    System.out.print("Your Answer: ");
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.print("Your Answer: ");
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.print("Your Answer: ");
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b != 0) {
                        System.out.print("Your Answer: ");
                        System.out.println(a / b);
                    } else {
                        System.out.println("b cannot be zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Character, Run the code again.");
                    repeat = false;
                    break;
            }
        }
        sc.close();
    }
}
