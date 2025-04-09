package labs_examples.arrays.labs;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //ArrayList<Integer> arraylist = new ArrayList<>();

        // for(int x: array) {
        //     arraylist.add(x);
        //     //System.out.println(arraylist);
        // }
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 inclusive:");
        int num = scanner.nextInt();
        //System.out.println("The index of the entered number is : " + arraylist.indexOf(num));
        scanner.close(); // Close scanner to prevent resource leaks
        for(int i = 0; i< array.length; i++) {
            if (array[i] == num) {
                System.out.println("The index of the entered num in the array is: " + i);
                break;
            }
        }


        // write code here


    }
}