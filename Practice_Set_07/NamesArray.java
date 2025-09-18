package Day_09.Practice_Set_07;
import java.util.Scanner;

public class NamesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // to consume newline

        String[] names = new String[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }

        // output
        System.out.println("\nNames entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

