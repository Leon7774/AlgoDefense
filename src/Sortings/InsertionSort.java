package Sortings;

import java.util.Arrays;

public class InsertionSort {

    // Insertion Sort function
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than the key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

// Insertion Sort function that counts and prints swaps
public static int insertionSortWithCount(int[] arr) {
    int n = arr.length;
    int swapCount = 0;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        // Move elements that are greater than the key to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
            swapCount++;
        }
        arr[j + 1] = key;
    }
    //System.out.println("Total Swaps: " + swapCount);
    return swapCount;
}

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 34, 55, 43};
        System.out.println("Original Array: " + Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
