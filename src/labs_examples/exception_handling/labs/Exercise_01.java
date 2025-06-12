package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */


 
 class Exercise_01 {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3};
        try {
            System.out.println(nums[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
 }