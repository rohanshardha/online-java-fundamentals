package labs_examples.objects_classes_methods.labs.oop.A_inheritance;


// Without running the code below, please tell me what will print. Why?
// It will call both as the parent constructor is always initiated before child




public class Exercise_04 {
  public static void main(String[] args) {
      Parent c = new Child();
  }
}

class Parent {
  public Parent() {
    System.err.println("Parent called");
  }
}

class Child extends Parent {
  public Child() {
    System.err.println("Child called");
  }
}       