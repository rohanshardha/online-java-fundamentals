package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        int a = str.length();
        System.out.println("Length of str is: " + a);

        String str2 = "hello";
        System.out.println("Str 1 and Str 2 are equal: " + str.equals(str2));
        // please concatenate str & str2 and set the result to a new String variable below

String str3 = str + " " + str2;
        System.out.println(str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
System.out.println("The first 3 letters of str are : " + str.substring(0, 3));
    }


}