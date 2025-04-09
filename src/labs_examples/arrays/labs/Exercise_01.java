package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            nums[i] = num;
        }
        
        scanner.close(); // Close scanner to prevent resource leaks

        // Printing the array as well calculating the sum and average
        double sumOfNums = 0;
        double avgOfNums = 0d;
        for(int x: nums) {
            System.out.print(x + " ");
            sumOfNums += x;
        }


        avgOfNums = sumOfNums / nums.length;
        System.out.println();
        System.out.println("The sum of the numbers entered: " + sumOfNums);
        System.out.println("The average of nums: " + avgOfNums);

        
    }

}