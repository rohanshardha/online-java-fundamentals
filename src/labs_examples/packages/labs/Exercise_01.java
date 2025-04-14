package labs_examples.packages.labs;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

 
import labs_examples.packages.labs.packageB.ClassB;

public class Exercise_01 {
    public static void main(String[] args) {
        ClassB obj = new ClassB();

        obj.testAccess(); // calls the methods that are allowed
    }
}
