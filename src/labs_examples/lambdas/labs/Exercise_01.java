package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */
public class Exercise_01 {

    // 1) Functional interface: no parameters, returns void
    @FunctionalInterface
    interface NoParam {
        void run();
    }

    // 3) Functional interface: one parameter, returns same type
    @FunctionalInterface
    interface Unary<T> {
        T apply(T t);
    }

    // 5) Functional interface: two parameters, returns a value
    @FunctionalInterface
    interface BiOp<A, B, R> {
        R apply(A a, B b);
    }

    public static void main(String[] args) {
        // 2) Lambda implementation + use
        NoParam helloLambda = () -> System.out.println("Hello from lambda (no params).");
        helloLambda.run();

        // 2) Anonymous inner class implementation + use
        NoParam helloAnon = new NoParam() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous inner class (no params).");
            }
        };
        helloAnon.run();

        // 4) Lambda implementation for Unary<T> + use
        Unary<Integer> squareLambda = x -> x * x;
        System.out.println("Square of 7 via lambda: " + squareLambda.apply(7));

        // 4) Anonymous inner class for Unary<T> + use
        Unary<String> shoutAnon = new Unary<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase() + "!";
            }
        };
        System.out.println("Unary anonymous on 'java': " + shoutAnon.apply("java"));

        // 6) Lambda implementation for BiOp<A,B,R> + use
        BiOp<Integer, Integer, Integer> addLambda = (a, b) -> a + b;
        System.out.println("Add lambda 10 + 20 = " + addLambda.apply(10, 20));

        // 6) Anonymous inner class for BiOp<A,B,R> + use
        BiOp<String, Integer, String> repeatAnon = new BiOp<String, Integer, String>() {
            @Override
            public String apply(String s, Integer n) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) sb.append(s);
                return sb.toString();
            }
        };
        System.out.println("Repeat anon: " + repeatAnon.apply("ha", 3));

        // 7) Built-in functional interfaces

        // Predicate<T> — tests a condition and returns boolean (Java 8 friendly)
        Predicate<String> nonEmpty = str -> str != null && !str.trim().isEmpty();
        System.out.println("Predicate nonEmpty('Hi'): " + nonEmpty.test("Hi"));
        System.out.println("Predicate nonEmpty('   '): " + nonEmpty.test("   "));

        // BiFunction<T, U, R> — takes two inputs and returns a result
        BiFunction<Double, Double, Double> hypot = (x, y) -> Math.hypot(x, y);
        System.out.println("BiFunction hypot(3,4) = " + hypot.apply(3.0, 4.0));

        // (Optional extras) Supplier<T> & Consumer<T>
        Supplier<Long> timestamp = System::currentTimeMillis;
        Consumer<Object> logger = o -> System.out.println("LOG: " + o);
        logger.accept("currentTimeMillis = " + timestamp.get());
    }
    }
