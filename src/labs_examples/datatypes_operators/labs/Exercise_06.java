package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        int h = 5;
        double r = 3.14d;
        double surfaceArea = 2 * 3.14 * (3.14 + 5);
        System.out.println("Surface area with radius of 3.14 and height of 5 is " + surfaceArea);

        double volume = 3.14 * 3.14 * 3.14 * 5;
        System.out.println("volume with radius of 3.14 and height of 5 is " + volume);

    }
}