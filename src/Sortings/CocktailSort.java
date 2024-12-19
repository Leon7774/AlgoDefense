package Sortings;

public class CocktailSort {
    public static void cocktailSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;

            swapped = false;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    // Swap arr[i] and arr[i - 1]
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static int cocktailSortWithCount(int[] arr) {
        int swapCount = 0;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            if (!swapped) break;

            swapped = false;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    // Swap arr[i] and arr[i - 1]
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
        } while (swapped);

        //System.out.println("Total swaps: " + swapCount);
        return swapCount;
    }

    public static void adaptiveCocktailSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) {
            swapped = false;

            // Left to right pass
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is sorted
            if (!swapped) {
                break;
            }

            // Update end pointer
            end--;

            swapped = false;

            // Right to left pass
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    // Swap arr[i] and arr[i - 1]
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }

            // Update start pointer
            start++;
        }
    }
}
