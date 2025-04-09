package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arraylist.add(i);
            System.out.print(arraylist.get(i-1) + " ");
        }
        System.out.println();

        if (arraylist.isEmpty()) {
            System.out.println("The Arrayst is empty");
        } else {
            System.out.println("The arraylist is not empty");
        }
        System.out.println("The size of the arrayst is: " + arraylist.size());
      
    }
    }
