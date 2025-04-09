package labs_examples.objects_classes_methods.labs.objects;

// For this exercise please create two classes. The first class is the controller and it will contain the main() method.
// The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
// at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
// a different constructor.

public class Exercise_04 {
    public static void main(String[] args) {
        // Using default constructor
        MyCar car1 = new MyCar();
        System.out.println(car1);;

        // Using constructor with make and model
        MyCar car2 = new MyCar("Toyota", "Camry");
        System.out.println(car2);;

        // Using constructor with make, model, and year
        MyCar car3 = new MyCar("Tesla", "Model S", 2024);
        System.out.println(car3);
    }
}

class MyCar {
    String make;
    String model;
    int year;

    // Default constructor
    public MyCar() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with make and model
    public MyCar(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2020; // default year
    }

    // Constructor with make, model, and year
    public MyCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public String toString() {
        return "Car: " + make + " " + model + " (" + year + ")";
    }
}

