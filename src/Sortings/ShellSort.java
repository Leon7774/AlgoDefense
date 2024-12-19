package Sortings;

public class ShellSort {
    public static int[] shellSort(int[] arr, int limit) {
        int n = arr.length;
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
        return arr;
    }


    public static int shellSortWithCount(int[] arr, int limit) {
        int n = arr.length;
        int swapCount = 0;
        for (int gap = n / 2; gap > limit; gap /= 2) {
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
        //System.out.println(swapCount);
        return swapCount;
    }
}
