package practice.codingBat.warmUP1;

// Return true if the last digit of two non negative numbers is the same

public class Question3 {
    public boolean lastNumber(int a, int b) {
        if (a % 10 == b%10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        System.out.println(q3.lastNumber(17, 57));
    }
    
}
