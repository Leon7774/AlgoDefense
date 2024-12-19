package Sortings;

public class CombinedSort {

    public static int[] sort(int[] arr, int shellIterations) {
        int n = arr.length;

        // Check if the array is already sorted
        boolean alreadySorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                alreadySorted = false;
                break;
            }
        }
        if (alreadySorted) {
            return arr; // Return the sorted array since it is already sorted
        }

        // Reduce gap size based on limit and perform sorting
        for (int gap = n / 2; gap > shellIterations; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        /*
        // Perform the specified number of Shellsort iterations
        shellSort(arr, shellIterations);
        // Then finish with Bubble Sort
        bubbleSort(arr);
        return arr;

         */

        return arr;
    }

    public static void shellSort(int[] arr, int limit) {
        int n = arr.length;
        // Reduce gap size based on limit and perform sorting
        for (int gap = n / 2; gap > limit; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
        int shellIterations = 3; // Number of Shellsort iterations before switching to Bubble Sort

        int[] sortedArray = sort(arrayToSort, shellIterations);
    }
}
