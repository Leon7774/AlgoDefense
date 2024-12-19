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
                SelectionSort.selectionSort(warmUpArray);
            }

            totalRuntime = 0;
            for (int i = 0; i < numTrials; i++) {
                int[] arr = ArrayGenerator.generateRandomizedArray(size);
                long start = System.nanoTime();
                SelectionSort.selectionSort(arr);
                long end = System.nanoTime();
                totalRuntime += end - start;
            }

            double averageRuntime = (double) totalRuntime / numTrials;
            System.out.printf("Average runtime for Selection Sort of size %d: %.2f ms%n", size, averageRuntime/1000);
        }
    }


}
