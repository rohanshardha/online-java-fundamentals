package labs_examples.objects_classes_methods.examples;

/* A program that uses the Vehicle class.

   Call this file VehicleDemo.java
*/

class Vehicle4 {

    private static final double INTEREST_RATE = 0.05;

    // notice that the variables below are private
    private int passengers; // number of passengers
    private int fuelcap;    // fuel capacity in gallons
    private int mpg;        // fuel consumption in miles per gallon

    Vehicle4(int passengers, int fuelcap, int mpg){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
                this.mpg = mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelCap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public int calculateRange() {
        return fuelcap * mpg;
    }

    public static double getInterestRate(){
        return INTEREST_RATE;
    }

}

// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String args[]) {

        int range;

        // assign values to fields in minivan

        Vehicle4 minivan = new Vehicle4(8, 20, 20);

        double i = Vehicle4.getInterestRate();
        System.out.println("The interest rate on mini van is " + i);

        range = minivan.calculateRange();

        System.out.println("Minivan can carry " + minivan.getPassengers() +
                " with a range of " + range);

        int val = sum(10,12);
        System.out.println("The sum of the numbers is " + val);

    }

    public static int intMethod(){
        int number = 10;
        return number;
    }

    public static double doubleMethod(){
        double number = 10.0;
        return number;
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
