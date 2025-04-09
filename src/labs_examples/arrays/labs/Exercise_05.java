package labs_examples.arrays.labs;

public class Exercise_05 {
    public static void main(String[] args) {
        // Create and populate an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print every other element in reverse order
        System.out.println("Every other element in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i -= 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
