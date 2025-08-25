package labs_examples.lambdas.examples.lambdas;
import java.util.*;
public class DemoExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); 
        names.add("Rohan");
        names.add("Ryan");
        names.add("Rinier");
        names.add("Kim");

        names.stream()
            .filter((x) -> x.startsWith("R"))
            .map((x) -> x.toUpperCase())
            .forEach(System.out::println);
    }
    
}
