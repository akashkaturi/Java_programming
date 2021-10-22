import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if (x == arr[i]) {
                System.out.println("The number is located at pos: " + i);
            }
        }
        sc.close();
    }

}
