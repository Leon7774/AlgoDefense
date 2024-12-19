package OldClasses;

import java.util.Arrays;

public class BoyerMoore {

    private static final int ALPHABET_SIZE = 256;

    // Function to precompute the bad character table
    private static int[] preprocessBadCharacter(String pattern) {
        int[] badCharTable = new int[ALPHABET_SIZE];
        Arrays.fill(badCharTable, -1);

        for (int i = 0; i < pattern.length(); i++) {
            badCharTable[pattern.charAt(i)] = i;
        }
        return badCharTable;
    }

    // Function to preprocess the good suffix table
    private static int[] preprocessGoodSuffix(String pattern) {
        int m = pattern.length();
        int[] goodSuffixTable = new int[m];
        int[] suffixes = new int[m];

        Arrays.fill(goodSuffixTable, m);
        suffixes[m - 1] = m;

        for (int i = m - 2; i >= 0; i--) {
            int j = i;
            while (j >= 0 && pattern.charAt(j) == pattern.charAt(m - 1 - i + j)) {
                j--;
            }
            suffixes[i] = i - j;
        }

        for (int i = 0; i < m - 1; i++) {
            goodSuffixTable[m - 1 - suffixes[i]] = m - 1 - i;
        }

        for (int i = 0; i < m - 1; i++) {
            goodSuffixTable[i] = m - suffixes[i];
        }

        return goodSuffixTable;
    }

    // Function to search using the Boyer-Moore algorithm
    public static void boyerMooreSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Preprocess the bad character and good suffix tables
        int[] badCharTable = preprocessBadCharacter(pattern);
        int[] goodSuffixTable = preprocessGoodSuffix(pattern);

        int shift = 0; // Position where the pattern aligns with the text
        while (shift <= (n - m)) {
            int j = m - 1;

            // Keep reducing j while characters are matching
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            // If the pattern is found
            if (j < 0) {
                System.out.println("Pattern found at index " + shift);
                shift += goodSuffixTable[0];  // Shift pattern to the right
            } else {
                // Use both bad character and good suffix heuristics
                int badCharShift = Math.max(1, j - badCharTable[text.charAt(shift + j)]);
                int goodSuffixShift = goodSuffixTable[j];
                shift += Math.max(badCharShift, goodSuffixShift);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABABCABABABCABABABC";
        String pattern = "ABABC";

        boyerMooreSearch(text, pattern);
    }
}
