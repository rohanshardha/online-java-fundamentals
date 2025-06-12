package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05 {

    public static void main(String[] args) {
System.out.println("Dividing 64 by 4: " + myDivide(64, 4));
try {
    System.out.println("Dividing 64 by 0: " + myDivide(64, 0));
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
    }
    public static int myDivide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dividing by 0");
        } else {
            return a/b;
        }

    }

}