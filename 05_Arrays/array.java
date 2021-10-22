import java.util.*;

public class array {
    public static void main(String[] args) {
        // new is a keyword to define space in the memory
        int marks[] = new int[20];
        int age[] = { 12, 12, 13, 11, 10 };
        String name[] = { "Akash", "Shradha", "Urvi" };
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        // marks[i] = sc.nextInt();
        // }
        for (int i = 0; i < age.length; i++) {
            System.out.println("The marks of subject " + i + " is " + marks[i]);
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }

}
