package Sortings;

public class CombinedSort {

    public static int[] sort(int[] arr, int shellIterations) {
        int n = arr.length;

        /*
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

         */

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


    public static int sortWithCount(int[] arr, int shellIterations) {
        int n = arr.length;
        int swapCount = 0;

        // Reduce gap size based on limit and perform sorting
        for (int gap = n / 2; gap > shellIterations; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    swapCount++;
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
                    swapCount++;
                }
            }
        }

        //System.out.println(swapCount);
        return swapCount;
    }


    public static int improvedBushSortWithCount(int[] arr, int shellIterations) {
        int n = arr.length;
        int swapCount = 0;

        // Reduce gap size based on limit and perform sorting
        for (int gap = n / 2; gap > shellIterations; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    swapCount++;
                }
                arr[j] = temp;
            }
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }

            if (!swapped) break;

            swapped = false;
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    // Swap arr[i] and arr[i - 1]
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
        } while (swapped);

        //System.out.println(swapCount);
        return swapCount;
    }

    public static int adaptiveImprovedBushSortWithCount(int[] arr, int shellIterations) {
        int n = arr.length;
        int swapCount = 0;

        // Reduce gap size based on limit and perform sorting
        for (int gap = n / 2; gap > shellIterations; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    swapCount++;
                }
                arr[j] = temp;
            }
        }

        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) {
            swapped = false;

            // Left to right pass
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            if (!swapped) {
                break;
            }

            end--;

            swapped = false;

            // Right to left pass
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            start++;
        }
        //System.out.println("Total swaps: " + swapCount);
        return swapCount;
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
