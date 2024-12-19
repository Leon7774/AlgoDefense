import java.io.FileWriter;
import java.io.IOException;

public class MethodRuntimeToCSV {
    public static void main(String[] args) {
        // Measure method runtime
        long startTime = System.nanoTime();
        sampleMethod(); // Call your method here
        long endTime = System.nanoTime();

        long runtime = endTime - startTime; // Runtime in nanoseconds

        // Write runtime to a CSV file
        String fileName = "method_runtime.csv";
        try (FileWriter writer = new FileWriter(fileName, true)) { // Append mode
            writer.append("MethodName,Runtime (nanoseconds)\n"); // Header (optional, write only once)
            writer.append("sampleMethod,").append(String.valueOf(runtime)).append("\n");
            System.out.println("Runtime written to CSV file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Sample method to test runtime
    private static void sampleMethod() {
        try {
            Thread.sleep(1000); // Simulate some work (1 second)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
