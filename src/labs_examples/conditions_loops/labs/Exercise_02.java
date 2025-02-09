package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number to find out the day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println(("Sunday"));
            } else if (number == 2) {
                System.out.println(("Monday"));
            } else if (number == 3) {
                System.out.println("Tuesday");
            } else if (number == 4) {
                System.out.println("Wednesday");
            } else if (number == 5) {
                System.out.println("Thursday");
            } else if (number == 6) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Other");
        }


    }
}
