package labs_examples.lambdas.labs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;        // List, Arrays, OptionalDouble, Optional, etc.
import java.util.stream.*; // Stream, IntStream, Collectors, etc.

/**
 * Lambdas Exercise 4:
 *
 *  Stream API Labs
 *
 *  1) range(…) to print 1..15 inclusive
 *  2) sum() to sum a set of numbers
 *  3) map() to transform then sum
 *  4) filter() then average() -> assign to int
 *  5) reduce() to sum a list
 *  6) Stream a text file and print each line (using classpath resource pattern)
 *  7) Stream stream_text_lab.csv, split, print element at index 1
 *  8) Same CSV: sum integers at index 2
 *  9) anyMatch()
 * 10) allMatch()
 * 11) collect() into a List
 */
public class Exercise_04 {

    public static void main(String[] args) {

        // 1) IntStream.rangeClosed produces 1..15 inclusive
        System.out.print("1..15 = ");
        IntStream.rangeClosed(1, 15)
                 .forEach(n -> System.out.print(n + (n < 15 ? " " : "")));
        System.out.println();

        // 2) sum() over a set of ints
        int total = IntStream.of(3, 7, 10, 5, 8).sum();
        System.out.println("Sum of {3,7,10,5,8} = " + total);

        // Reusable list for following demos
        List<Integer> nums = Arrays.asList(4, 9, 12, 3, 25, 16, 7, 10);

        // 3) map() each element (square) then sum
        int sumOfSquares = nums.stream()
                               .mapToInt(x -> x * x) // transform Integer -> int (square)
                               .sum();               // terminal op
        System.out.println("Sum of squares = " + sumOfSquares);

        // 4) filter() to keep >= 10, average(), then store as int (rounded)
        OptionalDouble optAvg = nums.stream()
                                    .mapToInt(Integer::intValue)
                                    .filter(x -> x >= 10)
                                    .average();                    // OptionalDouble
        int avgAsInt = (int) Math.round(optAvg.orElse(0.0));        // default 0.0 if empty
        System.out.println("Average of values >= 10 (rounded) = " + avgAsInt);

        // 5) reduce() to sum (identity 0, accumulator a+b)
        int reducedSum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum via reduce() = " + reducedSum);

        // 6) Read text file from classpath and print each line
        System.out.println("\n--- 6) Reading text file line by line ---");
        try (BufferedReader br = openResourceReader("/labs_examples/lambdas/labs/stream_text_lab.csv")) {
            if (br != null) {
                br.lines()
                  .forEach(System.out::println);
            } else {
                System.out.println("Resource not found: stream_text_lab.csv (ensure it's on the classpath).");
            }
        } catch (IOException e) {
            System.out.println("Error reading file for #6: " + e.getMessage());
        }

        // 7) Read CSV from classpath and print column 1 (second column)
        System.out.println("\n--- 7) CSV: print element at index 1 for each line ---");
        try (BufferedReader br = openResourceReader("/labs_examples/lambdas/labs/stream_text_lab.csv")) {
            if (br != null) {
                br.lines()
                  .filter(line -> !line.trim().isEmpty())        // skip blanks
                  .filter(line -> !line.trim().startsWith("#"))  // skip comments
                  .map(line -> line.split(","))                  // split row -> columns
                  .filter(arr -> arr.length > 1)                 // ensure index 1 exists
                  .forEach(arr -> System.out.println(arr[1].trim()));
            } else {
                System.out.println("Resource not found: stream_text_lab.csv (ensure it's on the classpath).");
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV for #7: " + e.getMessage());
        }

        // 8) Sum numeric values in column index 2 (third column). Skip non-numeric safely.
        System.out.println("\n--- 8) CSV: sum of numeric elements at index 2 ---");
        try (BufferedReader br = openResourceReader("/labs_examples/lambdas/labs/stream_text_lab.csv")) {
            if (br != null) {
                int sumIndex2 = br.lines()
                                  .filter(line -> !line.trim().isEmpty())
                                  .filter(line -> !line.trim().startsWith("#"))
                                  .map(line -> line.split(","))
                                  .filter(arr -> arr.length > 2)        // ensure index 2 exists
                                  .map(arr -> arr[2].trim())
                                  .map(Exercise_04::safeParseInt)       // Stream<Optional<Integer>>
                                  .filter(Optional::isPresent)          // keep only parse successes
                                  .mapToInt(opt -> opt.get())           // unbox Integer -> int
                                  .sum();
                System.out.println("Sum of numeric values at index 2 = " + sumIndex2);
            } else {
                System.out.println("Resource not found: stream_text_lab.csv");
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV for #8: " + e.getMessage());
        }

        // 9) anyMatch() - check if any number is greater than 20
        System.out.println("\n--- 9) anyMatch() example ---");
        boolean anyGreaterThan20 = nums.stream()
                                       .anyMatch(x -> x > 20);
        System.out.println("Any number > 20? " + anyGreaterThan20);

        // 10) allMatch() - check if all numbers are positive
        System.out.println("\n--- 10) allMatch() example ---");
        boolean allPositive = nums.stream()
                                  .allMatch(x -> x > 0);
        System.out.println("All numbers positive? " + allPositive);

        // 11) collect() into a List - get all even numbers
        System.out.println("\n--- 11) collect() into List example ---");
        List<Integer> evenNumbers = nums.stream()
                                        .filter(x -> x % 2 == 0)
                                        .collect(Collectors.toList());
        System.out.println("Even numbers collected: " + evenNumbers);

        // Additional collect() examples
        List<Integer> squaredOdds = nums.stream()
                                        .filter(x -> x % 2 == 1)  // odd numbers
                                        .map(x -> x * x)          // square them
                                        .collect(Collectors.toList());
        System.out.println("Squared odd numbers: " + squaredOdds);
    }

    /**
     * Helper method to safely parse a string to Integer, returning Optional.empty() on failure
     */
    private static Optional<Integer> safeParseInt(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    /**
     * Helper method to open a BufferedReader for a classpath resource
     */
    private static BufferedReader openResourceReader(String resourcePath) {
        InputStream inputStream = Exercise_04.class.getResourceAsStream(resourcePath);
        if (inputStream != null) {
            return new BufferedReader(new InputStreamReader(inputStream));
        }
        return null;
    }
}