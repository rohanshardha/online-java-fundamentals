package labs_examples.objects_classes_methods.labs.oop.b_polymorphism;

interface Animal {
    public void eating();
    public void sleeping();
    public void walking();
    public void drinking();
}

class Dog implements Animal {
    String name;
    public Dog(String name) {
        this.name =name;
    }

    @Override
    public void sleeping() {
        System.out.println(name + " is sleeping in its cage");
    }

    @Override
    public void eating() {
        System.out.println(name + " is eating a biscuit");
    }
    @Override
    public void drinking() {
        System.out.println(name + " is drinking milk");
    }
    @Override
    public void walking() {
        System.out.println(name + " is gone for a walk with Joe");
    }

}

class Eagle implements Animal {
    String name;
    public Eagle(String name) {
        this.name =name;
    }

    @Override
    public void sleeping() {
        System.out.println(name + " is sleeping in its nest on the tree");
    }

    @Override
    public void eating() {
        System.out.println(name + " is eating a fish");
    }
    @Override
    public void drinking() {
        System.out.println(name + " is drinking water at the lake");
    }
    @Override
    public void walking() {
        System.out.println(name + " Walking? Smarty pants it flies not doesn't walk much!!!");
    }

}


class PolyControl {
    Animal animal;
    public PolyControl(Animal animal) {
        this.animal = animal;
    }
    public void animalMethods() {
        animal.sleeping();
        animal.walking();
        animal.eating();
        animal.drinking();

    }

}

public class Exercise_01B {
    public static void main(String[] args) {
        Animal tommy = new Dog("Tommy");
        Animal shahhine = new Eagle("Shahhine");
        System.out.println("Example of dog class \n");
        PolyControl myAnimal = new PolyControl(tommy);
        myAnimal.animalMethods();
        System.out.println("\n Example of the eagle class \n");
        PolyControl myEagle = new PolyControl(shahhine);
        myEagle.animalMethods();

    }
        
    
}