package labs_examples.conditions_loops.labs;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert to lowercase for easier comparison

        String vowels = "aeiou";
        int index = 0;
        char firstVowel = '\0'; // Default value for when no vowel is found

        // Using while loop to find the first vowel
        while (index < word.length()) {
            System.out.println((index));
            char currentChar = word.charAt(index);
            System.out.println(currentChar);
            System.out.println("Checking if the letter is a vowel "+ vowels.indexOf(currentChar));
            if (vowels.indexOf(currentChar) != -1) { // Check if the character is a vowel
                firstVowel = currentChar;
                break;
            }
            index++;
        }

        // Output the result
        if (firstVowel != '\0') {
            System.out.println("Word: " + word);
            System.out.println("First vowel: " + firstVowel);
        } else {
            System.out.println("No vowels found in the word.");
        }

        scanner.close();
    }
}
