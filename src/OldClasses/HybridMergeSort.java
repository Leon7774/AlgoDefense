package OldClasses;

import java.util.Arrays;

public class HybridMergeSort {

    // Hybrid Merge Sort with Insertion Sort for small arrays
    public static void hybridMergeSort(int[] arr, int low, int high) {
        int threshold = 10; // Array size threshold for switching to Insertion Sort
        if (high - low < threshold) {
            insertionSort(arr, low, high);
            return;
        }

        if (low < high) {
            int mid = (low + high) / 2;

            // Recursively sort the two halves
            hybridMergeSort(arr, low, mid);
            hybridMergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    // Insertion Sort function for small arrays
    public static void insertionSort(int[] arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= low && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge function (same as standard Merge Sort)
    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 34, 55, 43};
        System.out.println("Original Array: " + Arrays.toString(arr));

        hybridMergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
