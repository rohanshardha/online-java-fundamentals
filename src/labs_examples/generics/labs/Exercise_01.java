package labs_examples.generics.labs;

class Exercise<T> {
    private T obj1;
    private T obj2;

    // constructor
    public Exercise(T var1, T var2) {
        this.obj1 = var1;
        this.obj2 = var2;
    }

    // getter and setter for obj1
    public T getObj1() {
        return obj1;
    }
    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    // getter and setter for obj2
    public T getObj2() {
        return obj2;
    }
    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "Exercise_01{" +
               "obj1=" + obj1 +
               ", obj2=" + obj2 +
               '}';
    }
}

public class Exercise_01{
    public static void main(String[] args) {
        // String pair
        Exercise<String> stringPair = new Exercise<>("Hello", "World");
        System.out.println(stringPair);
        stringPair.setObj2("Java");
        System.out.println(stringPair.getObj2());

        // Integer pair
        Exercise<Integer> intPair = new Exercise<>(10, 20);
        System.out.println(intPair);
        intPair.setObj1(42);
        System.out.println(intPair.getObj1());         // 42

        // Mixed demonstration using Double
        Exercise<Double> doublePair = new Exercise<>(3.14, 2.718);
        System.out.println(doublePair);
    }
}
