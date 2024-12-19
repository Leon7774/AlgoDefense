package Tests;

import Sortings.*;
import Utils.ArrayGenerator;

public class TestClass {
    public static void main(String[] args) {
        printAverageRuntime();
    }

    public static void printAverageSwaps() {
        long totalSwaps;
        int numTrials = 50; // Number of trials to average over

        int[] sizes = {10, 100, 1000, 10000, 100000};

        for (int size : sizes) {
            totalSwaps = 0;
            for (int i = 0; i < numTrials; i++) {
                int[] arr = ArrayGenerator.generateRandomizedArray(size);
                totalSwaps += CocktailSort.cocktailSortWithCount(arr);
            }

            double averageSwaps = (double) totalSwaps / numTrials;
            System.out.println("Average swaps for Shell Sort of size " + size + ": " + averageSwaps);
        }
    }


    public static void printAverageRuntime() {
        long totalRuntime;
        int numTrials = 50; // Number of trials to average over

        int[] sizes = {10, 100, 1000, 10000, 100000};

        for (int size : sizes) {
            // Warm-up phase (not included in timing)
            for (int i = 0; i < 5; i++) {
                int[] warmUpArray = ArrayGenerator.generateRandomizedArray(size);
                //TODO
                // Kani ilisan, something like InsertionSort.insertionSort(warmupArray), etc
                CombinedSort.adaptiveImprovedBushSortWithCount(warmUpArray, 4);
            }

            totalRuntime = 0;
            for (int i = 0; i < numTrials; i++) {
                int[] arr = ArrayGenerator.generateRandomizedArray(size);
                long start = System.nanoTime();
                //TODO
                // 2nd ilisan, something like InsertionSort.insertionSort(arr), etc
                // If gamiton ang shellsort or bush sort, need sya nga CombinedSort.adaptiveImprovedBushSortWithCount(arr, 4)
                CombinedSort.adaptiveImprovedBushSortWithCount(arr, 4);
                long end = System.nanoTime();
                totalRuntime += end - start;
            }

            double averageRuntime = (double) totalRuntime / numTrials;
            System.out.printf("Average runtime for Combined Sort of size %d: %.2f ms%n", size, averageRuntime/1000);
        }
    }


}
