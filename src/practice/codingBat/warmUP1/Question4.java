package practice.codingBat.warmUP1;

//given a string return the last three strings as upper case if there are only three characters return all upper case

public class Question4 {
    public String last3UpperCase(String str) {
        if (str.length() > 3) {
            String temp= str.substring(str.length() - 3).toUpperCase();
            return str.substring(0 , str.length() - 3) + temp;
        } else {
            String temp = str.toUpperCase();
            return temp;
        }
    }
    public static void main(String[] args) {
        Question4 q4 = new Question4();
        System.out.println(q4.last3UpperCase("divisha"));
    }
}
