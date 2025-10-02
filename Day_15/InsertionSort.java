package Day_15;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // one position ahead to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert key at correct position
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        insertionSort(numbers);

        System.out.print("\nAfter sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
