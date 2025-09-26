package Day_12.Practice_Set_10;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            sb.append(email.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
