package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class Exercise_02 {
    public static void main(String[] args) {
        int nums[] = new int[] {4, 8, 16};
        for (int i = 0; i <= 3; i++) {
            try {
                System.out.println(nums[i]);
                System.out.println(nums[i]/0);
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IndexOutOfBoundsException f) {
                System.out.println(f.getMessage());
            }

        }
    }
}