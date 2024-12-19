import OldClasses.HybridShellQuickSort;
import Sortings.*;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CombinedSort.bubbleSort(arr);

        randomTest(10000);
        //
        // increasingTest();

        System.out.println("\n\n\n\n");

        increasingTest();
        System.out.println("\n\n\n\n");
        reverseSortedTest();



        /*

        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] arr3 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] arr4 = {31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        int[] barr1 = Arrays.copyOf(arr, arr.length);
        int[] barr2 = Arrays.copyOf(arr2, arr2.length);
        int[] barr3 = Arrays.copyOf(arr3, arr3.length);
        int[] barr4 = Arrays.copyOf(arr4, arr4.length);


        System.out.println("Sortings.BubbleSort");
        CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(arr));
        CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(barr2));
        CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(barr3));
        CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(barr4));
        System.out.println("Sortings.ShellSort");
        CodeTimer.timeCode(() -> Sortings.ShellSort.shellSort(arr, 0));
        CodeTimer.timeCode(() -> Sortings.ShellSort.shellSort(arr2, 0));
        CodeTimer.timeCode(() -> Sortings.ShellSort.shellSort(arr3, 0));
        CodeTimer.timeCode(() -> Sortings.ShellSort.shellSort(arr4, 0));

        System.out.println("BushSort");
        //CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(Sortings.ShellSort.shellSort(arr, 5)));
        CodeTimer.timeCode(() -> Sortings.CombinedSort.sort(barr1, 3));
        CodeTimer.timeCode(() -> Sortings.CombinedSort.sort(barr2, 3));
        CodeTimer.timeCode(() -> Sortings.CombinedSort.sort(barr3, 3));
        CodeTimer.timeCode(() -> Sortings.CombinedSort.sort(barr4, 3));

         */
    }

    public static void randomTest(int arraySize) {
        int[] arr = HybridShellQuickSort.generateRandomArray(arraySize);
        int[] arr2 = HybridShellQuickSort.generateRandomArray(arraySize);
        int[] arr3 = HybridShellQuickSort.generateRandomArray(arraySize);
        int[] arr4 = HybridShellQuickSort.generateRandomArray(arraySize);

        int[] barr1 = Arrays.copyOf(arr, arr.length);
        int[] barr2 = Arrays.copyOf(arr2, arr2.length);
        int[] barr3 = Arrays.copyOf(arr3, arr3.length);
        int[] barr4 = Arrays.copyOf(arr4, arr4.length);

        int[] carr1 = Arrays.copyOf(arr, arr.length);
        int[] carr2 = Arrays.copyOf(arr2, arr2.length);
        int[] carr3 = Arrays.copyOf(arr3, arr3.length);
        int[] carr4 = Arrays.copyOf(arr4, arr4.length);

        int[] darr1 = Arrays.copyOf(arr, arr.length);
        int[] darr2 = Arrays.copyOf(arr2, arr2.length);
        int[] darr3 = Arrays.copyOf(arr3, arr3.length);
        int[] darr4 = Arrays.copyOf(arr4, arr4.length);

        int[] earr1 = Arrays.copyOf(arr, arr.length);
        int[] earr2 = Arrays.copyOf(arr2, arr2.length);
        int[] earr3 = Arrays.copyOf(arr3, arr3.length);
        int[] earr4 = Arrays.copyOf(arr4, arr4.length);



        System.out.println("Sortings.BubbleSort");
        CodeTimer.timeCode(() -> BubbleSort.bubbleSortWithCount(barr1));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSortWithCount(barr2));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr3));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr4));
        System.out.println("BushSort");
        //CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(Sortings.ShellSort.shellSort(arr, 5)));
        CodeTimer.timeCode(() -> CombinedSort.sortWithCount(carr1, 4));
        CodeTimer.timeCode(() -> CombinedSort.sortWithCount(carr2, 4));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr3, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr4, 2));
        System.out.println("Sortings.ShellSort");
        CodeTimer.timeCode(() -> ShellSort.shellSortWithCount(arr, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSortWithCount(arr2, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr3, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr4, 0));
        System.out.println("Sortings.InsertionSort");
        CodeTimer.timeCodeNoPrint(() -> InsertionSort.insertionSort(barr1));

        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr2));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr3));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr4));

        System.out.println("Sortings.SelectionSort");
        CodeTimer.timeCodeNoPrint(() -> SelectionSort.selectionSort(earr1));

        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr2));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr3));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr4));

    }

    public static void increasingTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] arr3 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] arr4 = {31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        int[] barr1 = Arrays.copyOf(arr, arr.length);
        int[] barr2 = Arrays.copyOf(arr2, arr2.length);
        int[] barr3 = Arrays.copyOf(arr3, arr3.length);
        int[] barr4 = Arrays.copyOf(arr4, arr4.length);

        int[] carr1 = Arrays.copyOf(arr, arr.length);
        int[] carr2 = Arrays.copyOf(arr2, arr2.length);
        int[] carr3 = Arrays.copyOf(arr3, arr3.length);
        int[] carr4 = Arrays.copyOf(arr4, arr4.length);

        int[] darr1 = Arrays.copyOf(arr, arr.length);
        int[] darr2 = Arrays.copyOf(arr2, arr2.length);
        int[] darr3 = Arrays.copyOf(arr3, arr3.length);
        int[] darr4 = Arrays.copyOf(arr4, arr4.length);

        int[] earr1 = Arrays.copyOf(arr, arr.length);
        int[] earr2 = Arrays.copyOf(arr2, arr2.length);
        int[] earr3 = Arrays.copyOf(arr3, arr3.length);
        int[] earr4 = Arrays.copyOf(arr4, arr4.length);



        System.out.println("Sortings.BubbleSort");
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr1));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr2));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr3));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr4));
        System.out.println("BushSort");
        //CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(Sortings.ShellSort.shellSort(arr, 5)));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr1, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr2, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr3, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr4, 2));
        System.out.println("Sortings.ShellSort");
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr2, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr3, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr4, 0));
        System.out.println("Sortings.InsertionSort");
        CodeTimer.timeCodeNoPrint(() -> InsertionSort.insertionSort(barr1));

        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr2));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr3));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr4));

        System.out.println("Sortings.SelectionSort");
        CodeTimer.timeCodeNoPrint(() -> SelectionSort.selectionSort(earr1));

        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr2));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr3));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr4));
    }

    public static void reverseSortedTest() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int[] arr3 = {30, 29, 28, 27, 26, 25, 24, 23, 22, 21};
        int[] arr4 = {40, 39, 38, 37, 36, 35, 34, 33, 32, 31};

        int[] barr1 = Arrays.copyOf(arr, arr.length);
        int[] barr2 = Arrays.copyOf(arr2, arr2.length);
        int[] barr3 = Arrays.copyOf(arr3, arr3.length);
        int[] barr4 = Arrays.copyOf(arr4, arr4.length);

        int[] carr1 = Arrays.copyOf(arr, arr.length);
        int[] carr2 = Arrays.copyOf(arr2, arr2.length);
        int[] carr3 = Arrays.copyOf(arr3, arr3.length);
        int[] carr4 = Arrays.copyOf(arr4, arr4.length);

        int[] darr1 = Arrays.copyOf(arr, arr.length);
        int[] darr2 = Arrays.copyOf(arr2, arr2.length);
        int[] darr3 = Arrays.copyOf(arr3, arr3.length);
        int[] darr4 = Arrays.copyOf(arr4, arr4.length);

        int[] earr1 = Arrays.copyOf(arr, arr.length);
        int[] earr2 = Arrays.copyOf(arr2, arr2.length);
        int[] earr3 = Arrays.copyOf(arr3, arr3.length);
        int[] earr4 = Arrays.copyOf(arr4, arr4.length);

        System.out.println("Sortings.BubbleSort");
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr1));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr2));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr3));
        CodeTimer.timeCode(() -> BubbleSort.bubbleSort(barr4));
        System.out.println("BushSort");
        //CodeTimer.timeCode(() -> Sortings.BubbleSort.bubbleSort(Sortings.ShellSort.shellSort(arr, 5)));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr1, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr2, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr3, 2));
        CodeTimer.timeCode(() -> CombinedSort.sort(carr4, 2));
        System.out.println("Sortings.ShellSort");
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr2, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr3, 0));
        CodeTimer.timeCode(() -> ShellSort.shellSort(arr4, 0));
        System.out.println("Sortings.InsertionSort");
        CodeTimer.timeCodeNoPrint(() -> InsertionSort.insertionSort(barr1));

        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr2));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr3));
        CodeTimer.timeCode(() -> InsertionSort.insertionSort(darr4));

        System.out.println("Sortings.SelectionSort");
        CodeTimer.timeCodeNoPrint(() -> SelectionSort.selectionSort(earr1));

        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr2));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr3));
        CodeTimer.timeCode(() -> SelectionSort.selectionSort(earr4));
    }




}
