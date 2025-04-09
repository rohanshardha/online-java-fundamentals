package practice.codingBat.warmUP1;

// Given a string and an int pring a string with all the characters at index 0 and multiple of it like "Hello World" with int as 2 will be "Hlowrd:"

public class Question5 {
    public String stringNChars(String str, int x) {
        String temp = "";
        for (int i = 0; i< str.length() - 1; i += x) {
temp = temp + str.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        System.out.println(q5.stringNChars("hello world", 2));
    }
}
