package Day_15;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Assume current element is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        selectionSort(numbers);

        System.out.print("\nAfter sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
