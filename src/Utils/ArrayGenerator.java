package Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

    private static final Random random = new Random();

    // Generates a randomized array of given length
    public static int[] generateRandomizedArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Random numbers from 0 to 99
        }
        return array;
    }

    // Generates a randomized highly dispersed array
    public static int[] generateRandomizedHighlyDispersedArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10_000) - 5_000; // Random numbers from -5000 to 4999
        }
        return array;
    }

    // Generates a randomized lowly dispersed array
    public static int[] generateRandomizedLowlyDispersedArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(20) - 10; // Random numbers from -10 to 9
        }
        return array;
    }

    // Generates an increasing array
    public static int[] generateIncreasingArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }

    // Generates a decreasing array
    public static int[] generateDecreasingArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = length - i - 1;
        }
        return array;
    }

    // Generates an already sorted array in ascending order
    public static int[] generateSortedArrayAscending(int length) {
        int[] array = generateRandomizedArray(length);
        Arrays.sort(array); // Sort the array in ascending order
        return array;
    }

    // Generates an already sorted array in descending order
    public static int[] generateSortedArrayDescending(int length) {
        int[] array = generateRandomizedArray(length);
        Arrays.sort(array);
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }

    // Test the methods
    public static void main(String[] args) {
        System.out.println("Randomized Array: " + Arrays.toString(generateRandomizedArray(10)));
        System.out.println("Highly Dispersed Array: " + Arrays.toString(generateRandomizedHighlyDispersedArray(10)));
        System.out.println("Lowly Dispersed Array: " + Arrays.toString(generateRandomizedLowlyDispersedArray(10)));
        System.out.println("Increasing Array: " + Arrays.toString(generateIncreasingArray(10)));
        System.out.println("Decreasing Array: " + Arrays.toString(generateDecreasingArray(10)));
    }
}
