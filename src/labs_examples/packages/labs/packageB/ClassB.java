package labs_examples.packages.labs.packageB;

import labs_examples.packages.labs.packageA.ClassA;

    public class ClassB extends ClassA {

    public void testAccess() {
        // Can access protectedMethodA because ClassB extends ClassA
        protectedMethodA();

        publicMethodA(); 

        //protectedMethodA() does not throw a compile error as ClassB extends class A
    }
}
