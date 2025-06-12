package labs_examples.static_nonstatic.labs;

// Please create two classes that demonstrate the following:

// 1) A static method calling another static method in the same class
// 2) A static method calling a non-static method in the same class
// 3) A static method calling a static method in another class
// 4) A static method calling a non-static method in another class
// 5) A non-static method calling a non-static method in the same class
// 6) A non-static method calling a non-static method in another class
// 7) A non-static method calling a static method in the same class
// 8) A non-static method calling a static method in another class

public class A {

    public static void main(String[] args) {
        System.out.println("=== Static Calls ===");
        staticA();

        System.out.println("\n=== Non-Static Calls ===");
        A obj = new A();
        obj.nonStaticA();
    }

    // 1) Static method calling another static method in the same class
    public static void staticA() {
        System.out.println("1) staticA() calling staticB() in same class");
        staticB();

        // 2) Static calling non-static in same class
        System.out.println("\n2) staticA() calling nonStaticB() in same class");
        A obj = new A();
        obj.nonStaticB();

        // 3) Static calling static in another class
        System.out.println("\n3) staticA() calling B.staticX() from another class");
        B.staticX();

        // 4) Static calling non-static in another class
        System.out.println("\n4) staticA() calling B.nonStaticX() from another class");
        B bObj = new B();
        bObj.nonStaticX();
    }

    public static void staticB() {
        System.out.println("-> staticB() in class A");
    }

    // 5–8 covered here
    public void nonStaticA() {
        // 5) Non-static calling non-static in same class
        System.out.println("5) nonStaticA() calling nonStaticB() in same class");
        nonStaticB();

        // 6) Non-static calling non-static in another class
        System.out.println("\n6) nonStaticA() calling B.nonStaticY() from another class");
        B bObj = new B();
        bObj.nonStaticY();

        // 7) Non-static calling static in same class
        System.out.println("\n7) nonStaticA() calling staticB() in same class");
        staticB();

        // 8) Non-static calling static in another class
        System.out.println("\n8) nonStaticA() calling B.staticX() from another class");
        B.staticX();
    }

    public void nonStaticB() {
        System.out.println("-> nonStaticB() in class A");
    }
}

class B {

    public static void staticX() {
        System.out.println("-> staticX() in class B");
    }

    public void nonStaticX() {
        System.out.println("-> nonStaticX() in class B");
    }

    public void nonStaticY() {
        System.out.println("-> nonStaticY() in class B");
    }
}
