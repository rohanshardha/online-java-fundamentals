package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {
        //Exiting a while loop which is printing odd numbers starting from 2 as soon the first 50 numbers are printed
        int i = 1;
        int startNum = 2;
        while(i >= 0) {
            if (startNum % 2 != 0) {
                System.out.println(startNum);
                i++;
            }
            startNum ++;
            if ( i > 50) {
                break;
            }

}
    }
}
