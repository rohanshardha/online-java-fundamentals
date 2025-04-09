package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Multiply method");
        System.out.println(multiply(4, 4));
        System.out.println("Divide method");
        System.out.println(divide(4, 4));
        System.out.println("Calling my joke");
        myJoke();
        System.out.println("The number of seconds in 10 years are:");
        System.out.println(secondsInYear(10));
        System.out.println("The length of the varargs method is: ");
        System.out.println(varArgsLength(1, 2, 3, 4, 5, 6));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    static int multiply(int a, int b) {
        return a* b;
    }
    //    returns the result of a * b


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b) {
        return a / b;
    }



    // 3) Create a static void method that will print of joke of your choice to the console
    static void myJoke () {
        System.out.println("I wish I knew a joke");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    // assuming just regular years and no leap years
    static int secondsInYear(int numYears) {
        return numYears * 364 * 24 * 3600;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int varArgsLength(int... yourObject) {
        return yourObject.length;
    }






}
