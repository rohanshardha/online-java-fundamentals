package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
public class Exercise_03 {

    // 1) Sum two Number subclasses and return the result as a double
    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // 2) Count how many Strings in the collection are palindromes
    public static int countPalindromes(Collection<String> strings) {
        int count = 0;
        for (String s : strings) {
            StringBuilder sb = new StringBuilder(s);
            if (sb.reverse().toString().equals(s)) {
                count++;
            }
        }
        return count;
    }

    // 3) Swap the elements at positions i and j in the given array
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<? super T>> T maxInRange(ArrayList<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
        public static void main(String[] args) {
        // --- 1) sum ---
        double s1 = sum(10, 20.5);
        double s2 = sum(3.14f, 2); 
        System.out.println("Sum of 10 and 20.5: " + s1);
        System.out.println("Sum of 3.14f and 2:  " + s2);

        // --- 2) countPalindromes ---
        Collection<String> words = Arrays.asList("racecar", "hello", "level", "world", "noon");
        System.out.println("Number of palindromes: " + countPalindromes(words));

        // --- 3) swap ---
        Integer[] nums = { 1, 2, 3, 4 };
        System.out.println("Before swap: " + Arrays.toString(nums));
        swap(nums, 1, 3);
        System.out.println(" After swap: " + Arrays.toString(nums));

        // --- 4) maxInRange ---
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(1.2, 4.5, 3.3, 2.1, 5.0));
        Double maxVal = maxInRange(doubles, 1, 4);  // looks at elements 4.5, 3.3, 2.1
        System.out.println("Max in range [1,4): " + maxVal);

        // also works with Strings:
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Bob", "Alice", "Zoe", "Charlie"));
        System.out.println("Max String in [0,3): " + maxInRange(names, 0, 3)); // compares lexicographically
    }

}
