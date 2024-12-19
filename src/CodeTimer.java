public class CodeTimer {

    // Method to time a block of code
    public static double timeCode(Runnable codeBlock) {
        long startTime = System.nanoTime(); // Start timing

        codeBlock.run(); // Execute the code block

        long endTime = System.nanoTime(); // End timing
        long duration = endTime - startTime; // Calculate duration

        System.out.println("Execution time: " + duration + " nanoseconds");

        return duration;
    }

    public static double timeCodeNoPrint(Runnable codeBlock) {
        long startTime = System.nanoTime(); // Start timing

        codeBlock.run(); // Execute the code block

        long endTime = System.nanoTime(); // End timing
        long duration = endTime - startTime; // Calculate duration

        //System.out.println("Execution time: " + duration + " nanoseconds");

        return duration;
    }

    public static void main(String[] args) {
        // Example usage of the timeCode method
        timeCode(() -> {
            // Block of code to time (for example, a simple loop)
            int sum = 0;
            for (int i = 0; i < 1_000_000; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        });
    }
}
