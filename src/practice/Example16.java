package practice;
// parent class aka superclass
class Superclass { 
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class Subclass extends Superclass {
    // overrides printMethod in Superclass
    @Override
    public void printMethod() {
        System.out.println("Printed in Subclass");
    }

    public void someMethod(){
        // invoke the printMethod() in the "super" class
        super.printMethod();
        // invoke the printMethod() in "this" class
        this.printMethod();
    }
}

class Example16 {
    public static void main(String[] args){
        Subclass obj = new Subclass();
        obj.someMethod();
        
}
