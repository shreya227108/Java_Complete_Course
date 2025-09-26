package Day_12.Practice_Set_10;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'i');
            }
        }

        System.out.println(sb.toString());
    }
}
