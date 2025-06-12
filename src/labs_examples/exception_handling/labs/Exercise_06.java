package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */


 class Exercise_06 {

    public static void main(String[] args) {
        try {
            System.out.println("Dividing 64 by 4: " + myDivide(64, 4));
            System.out.println("Dividing 64 by 0: " + myDivide(64, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int myDivide(int a, int b) throws ArithmeticException {
            return a/b;

    }

}