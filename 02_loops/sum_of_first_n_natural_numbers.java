package loops;

import java.util.*;
public class sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
          
            System.out.println(i + " * " + n + " = " + i*n);
        }
        sc.close();
        
    }
}
