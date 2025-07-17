package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;
import java.util.*;

public class Exercise_02 {

    public static <T extends Number> double sumList(ArrayList<T> list) {
        double sum = 0.0;
        for (T num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example with Integer
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Sum of Integer list: " + sumList(intList));  // 15.0

        // Example with Double
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        System.out.println("Sum of Double list: " + sumList(doubleList));  // 6.6

        // Example with Float
        ArrayList<Float> floatList = new ArrayList<>(Arrays.asList(1.5f, 2.5f, 3.0f));
        System.out.println("Sum of Float list: " + sumList(floatList));    // 7.0

        // You can use other Number types (Long, Short, etc.) just as easily:
        ArrayList<Long> longList = new ArrayList<>(Arrays.asList(10L, 20L, 30L));
        System.out.println("Sum of Long list: " + sumList(longList));      // 60.0
    }
}