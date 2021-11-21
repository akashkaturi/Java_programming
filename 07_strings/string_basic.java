import java.util.*;

//Strings are immutable in Java
public class string_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);
        String s = "Tony Stark";
        strings_b();
        char_at_method(s);
        CompareTo("akash", "Katuri");

    }

    static void strings_b() {
        String firstname = "Tony";
        String lastName = "Stark";
        String fullName = firstname + "@" + lastName;
        System.out.println("Your name is " + fullName.length());
    }

    static void char_at_method(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

    // compare to method is used because In java strings are stored as
    // objects, at times some test cases may fail resulting in incomplete solution.
    // To avoid this we will just compare the value of strings, instead of comparing
    // objects.
    // this can be done using compareto function.
    static void CompareTo(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
