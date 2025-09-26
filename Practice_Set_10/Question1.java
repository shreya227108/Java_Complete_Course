package Day_12.Practice_Set_10;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        int totalLength = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            StringBuilder sb = new StringBuilder(arr[i]);
            totalLength += sb.length();
        }

        System.out.println(totalLength);
    }
}
