package labs_examples.objects_classes_methods.labs.oop.a_inheritance;
// /**
//  * Run the class below and study the output. What prints and why?
//  *
//  * Your answer:
// It will print 10 as tthe reference type is class A and int i is different for different classes and is not overridden 
//  *
//  */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
    int b = 30;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}