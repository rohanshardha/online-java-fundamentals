package practice;

public class Example2 {

    String make;
    String model;
    static int numCreated;

    public Example2(String make, String model) {

        this.make = make;
        this.model = model;
        numCreated++;
    }
}

class Main{

    public static void main(String[] args) {
        
        Example2 obj1 = new Example2("Toyota", "Tacoma");
        Example2 obj2 = new Example2("Toyota", "Coralo");
        Example2 obj3 = new Example2("VW", "Rudge");
System.out.println();
        System.out.println(obj1.model);
        System.out.println(Example2.numCreated);
        System.out.println(obj2.model);
        System.out.println(obj2.numCreated);
        System.out.println();
        System.out.println(obj3.model);
        System.out.println(obj3.numCreated);


    }
}