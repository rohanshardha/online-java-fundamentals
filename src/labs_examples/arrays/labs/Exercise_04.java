package labs_examples.arrays.labs;

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregularArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };

        for (int[] row : irregularArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
