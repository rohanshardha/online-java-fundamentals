package labs_examples.objects_classes_methods.labs.methods;
import java.util.ArrayList;

public class Exercise_02{

    // 1) Method Overloading
    public static void printMessage() {
        System.out.println("Hello, this is method overloading!");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(int number) {
        System.out.println("The number is: " + number);
    }

    // 2) Pass by Value vs Pass by Reference
    public static void modifyPrimitive(int num) {
        num = 10; // This change will not affect the original variable
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 99; // This change will affect the original array
    }

    // 3) Find the largest of 4 numbers
    public static int findLargest(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    // 4) Count consonants in a string
    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }

    // 5) Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 6) Find highest and lowest number in an array
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    // 7) Get numbers divisible by both divisors
    public static ArrayList<Integer> getDivisibleNumbers(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    // 8) Reverse an array in place using only one extra temp variable
    public static void reverseArray(int[] arr) {
        int temp;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main method to test the implementations
    public static void main(String[] args) {
        // Testing Method Overloading
        printMessage();
        printMessage("Overloaded method!");
        printMessage(42);

        // Testing Pass by Value vs Pass by Reference
        int num = 5;
        modifyPrimitive(num);
        System.out.println("After modifying primitive: " + num); // Should still be 5

        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println("After modifying array: " + arr[0]); // Should be 99

        // Testing Largest of 4 Numbers
        System.out.println("Largest number: " + findLargest(4, 8, 2, 9));

        // Testing Consonant Count
        System.out.println("Consonants in 'Hello World': " + countConsonants("Hello World"));

        // Testing Prime Number
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 18 prime? " + isPrime(18));

        // Testing Min and Max Finder
        int[] numbers = {3, 7, 1, 9, 2};
        int[] minMax = findMinMax(numbers);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        // Testing Divisible Numbers
        ArrayList<Integer> divisibleList = getDivisibleNumbers(20, 2, 3);
        System.out.println("Numbers divisible by 2 and 3: " + divisibleList);
        System.out.println("Length of list: " + divisibleList.size());

        // Testing Reverse Array
        int[] reverseTest = {1, 2, 3, 4, 5};
        reverseArray(reverseTest);
        System.out.print("Reversed Array: ");
        for (int numVal : reverseTest) {
            System.out.print(numVal + " ");
        }
    }
}