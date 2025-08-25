package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *  1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.function package.
 */
public class Exercise_02 {

    public static void main(String[] args) {
        // 1) Predicate<T> — tests a condition and returns boolean
        Predicate<String> nonEmpty = s -> s != null && !s.trim().isEmpty();
        System.out.println("Predicate nonEmpty('Hi') = " + nonEmpty.test("Hi"));
        System.out.println("Predicate nonEmpty('   ') = " + nonEmpty.test("   "));

        // 2) BiPredicate<T, U> — tests a condition on two inputs
        BiPredicate<String, Integer> lengthAtLeast = (str, n) -> str != null && str.length() >= n;
        System.out.println("BiPredicate lengthAtLeast('Lambda', 5) = " + lengthAtLeast.test("Lambda", 5));
        System.out.println("BiPredicate lengthAtLeast('Hi', 5) = " + lengthAtLeast.test("Hi", 5));

        // 3) Function<T, R> — maps a value of type T to type R
        Function<String, Integer> parseLen = s -> (s == null) ? 0 : s.length();
        System.out.println("Function parseLen('function') = " + parseLen.apply("function"));

        // 4) BiFunction<T, U, R> — maps two inputs to a result
        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "sum=" + (a + b);
        System.out.println("BiFunction sumToString(7, 8) = " + sumToString.apply(7, 8));

        // 5) UnaryOperator<T> — a Function<T, T> with same input/output type
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("UnaryOperator square(9) = " + square.apply(9));

        // 6) BinaryOperator<T> — a BiFunction<T, T, T> (same type for both args and result)
        BinaryOperator<Integer> maxOp = (a, b) -> (a >= b) ? a : b; // or Integer::max
        System.out.println("BinaryOperator maxOp(3, 10) = " + maxOp.apply(3, 10));

        // 7) Supplier<T> — provides a value with no input
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Supplier randomSupplier.get() = " + randomSupplier.get());

        // 8) Consumer<T> — accepts a value and returns void (side effects)
        Consumer<String> printer = msg -> System.out.println("Consumer prints: " + msg);
        printer.accept("hello consumer");

        // 9) BiConsumer<T, U> — accepts two values and returns void
        BiConsumer<String, Integer> repeater = (text, times) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < times; i++) sb.append(text);
            System.out.println("BiConsumer repeater -> " + sb);
        };
        repeater.accept("ha", 3);

        // 10) IntPredicate — primitive specialization (avoids boxing)
        IntPredicate isEven = n -> (n % 2) == 0;
        System.out.println("IntPredicate isEven(14) = " + isEven.test(14));
        System.out.println("IntPredicate isEven(15) = " + isEven.test(15));
    }
}
