package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 3:
 *
 *  1) Demonstrate the use of a static method reference
 *  2) Demonstrate the use of an instance method reference
 *  3) Demonstrate the use of a constructor reference
 */

import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise_03 {

    public static void main(String[] args) {

        /*
         * 1) STATIC METHOD REFERENCE
         *
         * A static method reference uses the syntax ClassName::methodName
         * and refers to a method that belongs to the class rather than an instance.
         * It can be used anywhere a lambda could be used, provided the method
         * signature matches the functional interface method's signature.
         */

        // Example static method reference to Integer.parseInt(String) — takes a String, returns int
        Function<String, Integer> strToIntLambda = s -> Integer.parseInt(s); // Lambda version
        Function<String, Integer> strToIntMethodRef = Integer::parseInt;     // Static method reference

        // Both calls produce the same result
        System.out.println("Lambda parse '42' => " + strToIntLambda.apply("42"));
        System.out.println("Static method reference parse '42' => " + strToIntMethodRef.apply("42"));


        /*
         * 2) INSTANCE METHOD REFERENCE
         *
         * An instance method reference refers to a method that belongs to a specific object instance.
         * The syntax is instanceRef::methodName.
         * The functional interface method's parameter(s) will be passed to that instance method.
         */

        String sample = "hello world";

        // Lambda version — calls sample.toUpperCase()
        Supplier<String> upperLambda = () -> sample.toUpperCase();

        // Instance method reference version — matches Supplier<String>'s get() method
        Supplier<String> upperMethodRef = sample::toUpperCase;

        // Both produce "HELLO WORLD"
        System.out.println("Lambda toUpperCase() => " + upperLambda.get());
        System.out.println("Instance method reference toUpperCase() => " + upperMethodRef.get());


        /*
         * 3) CONSTRUCTOR REFERENCE
         *
         * A constructor reference uses the syntax ClassName::new.
         * It is used when we want to create new objects in a functional style,
         * and the constructor signature must match the functional interface's method signature.
         */

        // Constructor reference without parameters (matches Supplier<SomeClass>)
        Supplier<MyClass> myClassConstructorRef = MyClass::new; // Uses default constructor
        MyClass myObj = myClassConstructorRef.get();
        myObj.sayHello();

        // Constructor reference with parameters (matches Function<String, MyClass>)
        Function<String, MyClass> myClassWithNameConstructorRef = MyClass::new; // Uses 1-arg constructor
        MyClass namedObj = myClassWithNameConstructorRef.apply("Rohan");
        namedObj.sayHello();
    }
}

/**
 * Simple class to demonstrate constructor references.
 */
class MyClass {
    private String name;

    // No-arg constructor
    public MyClass() {
        this.name = "Default";
    }

    // Constructor with one String parameter
    public MyClass(String name) {
        this.name = name;
    }

    // Method to print a greeting using the object's name
    public void sayHello() {
        System.out.println("Hello from MyClass, name = " + name);
    }
}
