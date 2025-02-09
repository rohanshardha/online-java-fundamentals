package labs_examples.conditions_loops.examples;

// Compute integer powers of 2.
class Power {
    public static void main(String args[]) {
        int e;
        int result;

        for(int i=0; i < 10; i++) {
            result = 1;
            e = i;
            System.out.println("i is " + i);
            System.out.println("result variable is " + result);
            while(e > 0) {
                result *= 2;
                System.out.println("result variable is " + result);
                e--;
                System.out.println(("e is after the decrement is " + e));
            }

            System.out.println("2 to the " + i +
                    " power is " + result);
        }
    }
}
