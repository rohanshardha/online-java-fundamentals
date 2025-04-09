package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creating the factorial method, uncomment the two lines in the main() method.
 * When you run it, it should print 120. It should also work for any other number you pass it.
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x); // Should print 120
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        }
    
        return n * factorial(n - 1); // Recursive case
    }
}
