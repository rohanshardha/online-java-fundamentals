package labs_examples.exception_handling.labs;
import java.util.Scanner;  
/**
* Exception Handling Exercise 7:
*
*      1) Create a custom exception.
*      2) Demonstrate a method throwing your custom exception.
*/

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getting details of 3 different students");
       
        for (int i = 0; i < 3; i++) {
            try {
                String result = getDetails(scanner);
                System.out.println(result);
            } catch (NotTrueAge e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
   
    public static String getDetails(Scanner scanner) throws NotTrueAge {
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        
        System.out.print("What is your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        
       // Validation
        if (age < 0) {
            throw new NotTrueAge();
        } else { 
            return name + " is " + age + " years old";
        }
    }
}
class NotTrueAge extends Exception {
    public NotTrueAge() {
        super("Invalid age entered");
    }
    
    public NotTrueAge(String message) {
        super(message);
    }
    
    @Override
    public String toString() {
        return getMessage();
    }
 }