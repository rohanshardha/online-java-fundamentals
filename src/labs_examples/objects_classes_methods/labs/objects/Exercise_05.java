package labs_examples.objects_classes_methods.labs.objects;
// Building off the previous classes we created in Exercise_01

// 1) Create a toString() method in each POJO. You can do this by holding down the Control key and hitting
// enter at the same time. If you see a small menu choose toString() and generate from there. Otherwise you can
// select "Code" from the top most navbar of IntelliJ and then select "Generate" and choose toString();

// 2) In the main() method you created in the controller classes demonstrate creating a number of Objects using a variety
// of constructors that you created in the previous exercise.

// 3) After creating these objects, print the status of these objects. For example:
// System.out.println(cardObj.toString())


public class Exercise_05 {
    public static void main(String[] args) {
        // Using default constructor
        MyCar car1 = new MyCar();
        System.out.println(car1);
        System.out.println("Running the toString method on car1");
System.out.println(car1.toString());

        System.out.println();
        // Using constructor with make and model
        MyCar car2 = new MyCar("Toyota", "Camry");
        System.out.println(car2);;
        System.out.println("Running the toString method on car2");
        System.out.println(car2.toString());
        

        System.out.println();
        // Using constructor with make, model, and year
        MyCar car3 = new MyCar("Tesla", "Model S", 2024);
        System.out.println(car3);
        System.out.println("Running the toString method on car3");
        System.out.println(car3.toString());
        
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

