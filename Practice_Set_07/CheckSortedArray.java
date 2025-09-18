package Day_09.Practice_Set_07;
import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // check ascending order
        boolean isSorted = true;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("\nArray is sorted in ascending order.");
        else
            System.out.println("\nArray is NOT sorted in ascending order.");
    }
}
