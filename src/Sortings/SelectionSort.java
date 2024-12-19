package Sortings;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the smallest element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted portion
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static int selectionSortWithCount(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the smallexst element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted portion
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        //System.out.println("Total swaps: " + swapCount);
        return swapCount;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
