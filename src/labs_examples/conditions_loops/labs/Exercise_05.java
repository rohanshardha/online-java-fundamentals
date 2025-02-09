package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        // // Ensure num1 is less than num2 or equal
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        double sumOfNums = 0d;
        double avgOfNums = 0d;

        if (num1 != num2) {
            for (int i = num1; i <= num2; i++) {
                sumOfNums += i;
            }
            avgOfNums = sumOfNums / ((num2 - num1) + 1);
        } else {
            sumOfNums = num1 + num2;
            avgOfNums = (num2 + num1) / 2;
        }



        // Print Results
        System.out.println("Sum of numbers between the two numbers is: " + sumOfNums);
        System.out.println("The average of sum of all the numbers between and including the two numbers entered is: " + avgOfNums);
    }
}
