package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// 1) Demonstrate the three forms of Polymorphism:
//     - Overloading
//     - Overriding
//     - Interfaces

// 2) Demonstrate the three forms of polymorphism again - but in a new set of classes. We want to lock this in.
// Challenge yourself. Build something you're proud of.

// 3) Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
// parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
// understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
// application.
//**********
//Method overloading
//**********

class AreaCalculator {

    public void calculateArea(double radius) {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }

    public void calculateArea(double length, double width) {
        System.out.println("Area of rectangle: " + (length * width));
    }

    public void calculateArea(double multiplier, int base, int height) {
        System.out.println("Area of triangle: " + (multiplier * base * height));
    }

}

//**********
//Method overriding
//**********

class Superhero {
    public void usePower() {
        System.out.println("Using a generic superpower!");
    }
}

class Superman extends Superhero {
    @Override
    public void usePower() {
        System.out.println("Superman uses heat vision!");
    }
}

class Batman extends Superhero {
    @Override
    public void usePower() {
        System.out.println("Batman uses martial arts and gadgets!");
    }
}
//**********
//Interface based polymorphism
//********** 

interface Robot {
    void start();
    void performTask();
    void shutdown();
}

class CleaningRobot implements Robot {
    @Override
    public void start() {
        System.out.println("Cleaning robot powering up...");
    }

    @Override
    public void performTask() {
        System.out.println("Cleaning floors and vacuuming dust.");
    }

    @Override
    public void shutdown() {
        System.out.println("Cleaning robot shutting down.");
    }
}

class SecurityRobot implements Robot {
    @Override
    public void start() {
        System.out.println("Security robot activating surveillance systems...");
    }

    @Override
    public void performTask() {
        System.out.println("Patrolling premises and scanning for intruders.");
    }

    @Override
    public void shutdown() {
        System.out.println("Security robot powering off.");
    }
}


//**********
//Implementation class
//**********


public class Exercise_01{
    public static void main(String[] args) {
        System.out.println("Example of method overloading polymorphism");
        System.out.println();
        AreaCalculator ac = new AreaCalculator();
        ac.calculateArea(5);              // Circle
        ac.calculateArea(4, 6);           // Rectangle
        ac.calculateArea(0.5, 3, 7);           // Triangle
System.out.println("Examples of method overriding polymorphism");
System.out.println();
        Superhero hero1 = new Superman();
        Superhero hero2 = new Batman();

        hero1.usePower(); // Superman uses heat vision!
        hero2.usePower(); // Batman uses martial arts and gadgets!
        
            System.out.println("Examples of interface based polymorphism \n");
            Robot cleaningBot = new CleaningRobot();
            Robot securityBot = new SecurityRobot();
    
            System.out.println("Cleaning Robot \n");
            cleaningBot.start();
            cleaningBot.performTask();
            cleaningBot.shutdown();
    
            System.out.println("\nSecurity Robot \n");
            securityBot.start();
            securityBot.performTask();
            securityBot.shutdown();
        }
}