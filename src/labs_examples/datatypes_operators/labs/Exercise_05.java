package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        if (b || a){
            System.out.println("a is true so executes"); 
        }
        if (a & b){
            System.out.println("b is false so won't execute"); // this code will not execute 
        }
        if (a && b){
            System.out.println("b is false so won't execute"); // this code will not execute 
        }
        if (a ^ b){
            System.out.println("since one of them is true this will execute");
        }
        if (!a) {  
            System.out.println("a is false");  // This won't execute
        } else {
            System.out.println("a is tru so executing this blocke");   // This will execute
        }





        // write your code below

    }

}

