package Day_15;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop → comparisons in each pass
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        System.out.print("\nAfter sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
