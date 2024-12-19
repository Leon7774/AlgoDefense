package OldClasses;

import Sortings.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class HybridShellQuickSort {

    // Hybrid Sort: Shell Sort for first 3 iterations, then OldClasses.QuickSort
    public static void hybridSort(int[] arr) {
        int n = arr.length;

        // Perform 3 iterations of Shell Sort
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
            // Stop after 3 iterations of Shell Sort
            if (--n <= n / 2 - 3) break;
        }

        // Perform OldClasses.QuickSort on the partially sorted array
        quickSort(arr, 0, arr.length - 1);
    }

    // OldClasses.QuickSort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function for OldClasses.QuickSort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);  // Generate numbers between 0 and 99
        }
        return arr;
    }


}
