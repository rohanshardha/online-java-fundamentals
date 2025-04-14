package labs_examples.objects_classes_methods.labs.oop.A_inheritance;


// 1) Create at least 5 classes that demonstrate an labs_examples.inheritance hierachy. The depth of the hiearchy must be at least 3. Meaning:
// A extends B, B extends C. Classes A, B, and C define an labs_examples.inheritance hierachy with a depth of 3. Create a real-world
// labs_examples.inheritance hierarchy. For instance you could create an labs_examples.inheritance hiearchy using animals, or food, or the solar system,
// or stores, restaurants, adventures, and really anything else you can imagine. Have some fun with it. Try to challenge
// yourself.

// 2) Once you've created this hierarchy, demonstrate the use of non-default constructors in the parent classes. Meaning,
// use the super(arg1, arg2, ...) command from a subclass to invoke a parameterized constructor in the parent class. Do this
// at least once, several times over would be better.

// 3) Create at least three methods that override a method in one or more parent classes.

// 4) Create a controller class/method that will create objects of your hiearchy and demonstrate how you use this labs_examples.inheritance
// hiearchy. Demonstrate that your subclasses have set the variables in the parent classes, that you have called the parameterized
// super constructors from sub-classes, that you are indeed overriding methods.

class Animal {
    
    String group;
    public Animal(String group) {
        this.group = group;

    }
    void eating() {
        System.out.println("The animal is eating");
    }
    void walking() {
        System.out.println("The animal is walking");
    }
    void sleeping() {
        System.out.println("The animal is sleeping");
    }

}
class Birds extends Animal {
    String name;
    String type; //can be domesticated or not

    public Birds(String group, String name, String type) {
        super(group);
        this.name = name;
        this.type = type;
    }
    @Override
    void walking() {
        System.out.println("The animal is walking on 2 feet");
    }

}
class Eagle extends Birds {
    double wingSpan;
    public Eagle(String group, String name, String type, double wingSpan) {
        super(group, name, type);
        this.wingSpan = wingSpan;
    }
    void flying(String name, double wingSpan) {
        System.out.println("The " + name + " has a wingSpan of " + wingSpan + " when it is flying");
    }
}

class Mammals extends Animal {
    String name;
    String type; //can be domesticated or not

    public Mammals(String group, String name, String type) {
        super(group);
        this.name = name;
        this.type = type;
    }
    @Override
    void walking() {
        System.out.println("The animal is walking on 4 feet");
    }

}
class Tiger extends Mammals {
    double runningSpeed;
    public Tiger(String group, String name, String type, double runningSpeed) {
        super(group, name, type);
        this.runningSpeed = runningSpeed;
    }
    void running(double wingSpan) {
        System.out.println("The " + name + " has a running speed of " + runningSpeed + " when it is running");
    }
}

public class Exercise_01 {

    public static void main(String[] args) {
        Eagle myEagle = new Eagle("flyable", "Dodo", "Domesticated", 30.00);
        myEagle.sleeping();
        myEagle.eating();
        myEagle.flying("Dodo", 30.0);
        myEagle.walking();
        System.out.println("The print for tiger");
        System.out.println();
        Tiger myTiger = new Tiger("running", "Bodo", "Domesticated", 90.00);
        myTiger.sleeping();
        myTiger.eating();
        myTiger.running(90.0);
        myTiger.walking();

        
    }
}
