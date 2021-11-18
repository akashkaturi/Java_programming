

import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To take input
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
        sc.close();
    }
}
