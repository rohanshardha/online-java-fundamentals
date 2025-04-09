package practice.codingBat.warmUP1;
//return the max of two integers if they are in 10-20 inclusive or return zero if they are out of the range


public class Question1 {
    public static int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
          int temp = a;
          a = b;
          b = temp;
        }
        
        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
      }
      public static void main(String[] args) {
        Question1 q = new Question1();
        
        // Test cases
        System.out.println(max1020(11, 19)); // Should return 19
        System.out.println(q.max1020(19, 11)); // Should return 19
        System.out.println(q.max1020(11, 9));  // Should return 11
        System.out.println(q.max1020(9, 21));  // Should return 0
        System.out.println(q.max1020(7, 21));  // Should return 0
    }
    }
