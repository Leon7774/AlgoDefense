package Tests;

import Sortings.*;
import Utils.ArrayGenerator;

public class TestClass {
    public static void main(String[] args) {
        printAverageSwaps();
    }

    public static void printAverageSwaps() {
        long totalSwaps;
        int numTrials = 50; // Number of trials to average over

        int[] sizes = {10, 100, 1000, 10000, 100000};
        for (int size : sizes) {
            totalSwaps = 0;
            for (int i = 0; i < numTrials; i++) {
                int[] arr = ArrayGenerator.generateNearlySortedArray(size,0.2);
                totalSwaps += ShellSort.shellSortWithCount(arr, 0);
            }

            double averageSwaps = (double) totalSwaps / numTrials;
            System.out.println("Average swaps for Selection Sort of size " + size + ": " + averageSwaps);
        }
    }


    public static void printAverageRuntime() {
        long totalRuntime;
        int numTrials = 50; // Number of trials to average over

        int[] sizes = {10, 100, 1000, 10000, 100000};

        for (int size : sizes) {
            // Warm-up phase (not included in timing)
            for (int i = 0; i < 5; i++) {
                int[] warmUpArray = ArrayGenerator.generateRandomizedHighlyDispersedArray(size);
                //TODO
                // Kani ilisan, something like InsertionSort.insertionSort(warmupArray), etc
                CombinedSort.improvedBushSortWithCount(warmUpArray, 4);
            }

            totalRuntime = 0;
            for (int i = 0; i < numTrials; i++) {
                //TODO
                // need sad ilisan ang array generator here, for example if ang high dispersion table ang i fill kay gamiton nimo ang
                // ArrayGenerator.generateRandomizedHighlyDispersedArray(size)
                int[] arr = ArrayGenerator.generateNearlySortedArray(size, 0.2);
                long start = System.nanoTime();
                //TODO
                // 2nd ilisan, something like InsertionSort.insertionSort(arr), etc
                // If gamiton ang shellsort or bush sort, need sya nga CombinedSort.adaptiveImprovedBushSortWithCount(arr, 4)
                CombinedSort.improvedBushSortWithCount(arr, 4);
                long end = System.nanoTime();
                totalRuntime += end - start;
            }

            double averageRuntime = (double) totalRuntime / numTrials;
            System.out.printf("Average runtime for Combined Sort of size %d: %.2f ms%n", size, averageRuntime/1000);
        }
    }

    public static void printAverageRuntimeBushSort() {
        long totalRuntime;
        int numTrials = 50; // Number of trials to average over

        int[] sizes = {10, 100, 1000, 10000, 100000};

        for (int size : sizes) {
            // Warm-up phase (not included in timing)
            for (int i = 0; i < 5; i++) {
                int[] warmUpArray = ArrayGenerator.generateRandomizedHighlyDispersedArray(size);
                //TODO
                // Kani ilisan, something like InsertionSort.insertionSort(warmupArray), etc
                CombinedSort.improvedBushSortWithCount(warmUpArray, 4);
            }

            totalRuntime = 0;
            for (int i = 0; i < numTrials; i++) {
                //TODO
                // need sad ilisan ang array generator here, for example if ang high dispersion table ang i fill kay gamiton nimo ang
                // ArrayGenerator.generateRandomizedHighlyDispersedArray(size)
                int[] arr = ArrayGenerator.generateNearlySortedArray(size, 0.2);
                long start = System.nanoTime();
                //TODO
                // 2nd ilisan, something like InsertionSort.insertionSort(arr), etc
                // If gamiton ang shellsort or bush sort, need sya nga CombinedSort.adaptiveImprovedBushSortWithCount(arr, 4)
                CombinedSort.improvedBushSortWithCount(arr, 4);
                long end = System.nanoTime();
                totalRuntime += end - start;
            }

            double averageRuntime = (double) totalRuntime / numTrials;
            System.out.printf("Average runtime for Combined Sort of size %d: %.2f ms%n", size, averageRuntime/1000);
        }
    }


}
