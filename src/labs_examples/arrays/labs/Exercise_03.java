package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] table = new int[5][5];
        int num = 3;

        for (int i =0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (num*(j + 1)) + (15 * i);
                // Just increment the num by 3
                // table[i][j] = num;
                //num += 3;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
