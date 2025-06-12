package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

 class Exercise_04 {
    public static void main(String[] args) {
        int newm[] = {4, 8, 16, 32, 64};
        int deno[] = {2, 0, 4, 0};
        for (int i =0; i<= newm.length; i++) {
            try {
                int a = newm[i];
                int b = deno[i];
                try {
                    System.out.println("dividing " + a + " by " + b + " results in " +a/b);
                } catch(ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } catch (ArrayIndexOutOfBoundsException f) {
                System.out.println(f.getMessage());
            }
        }

    }
 }