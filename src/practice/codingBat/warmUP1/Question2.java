package practice.codingBat.warmUP1;
//Return true if the number of count of e is >=1 and <=3 otherwise false


public class Question2 {
    public boolean stringE(String str) {
        int count = 0;
      
        for (int i=0; i<str.length(); i++) {
          if (str.charAt(i) == 'e') count++;
          // alternately: str.substring(i, i+1).equals("e")
        }
      
        return (count >= 1 && count <= 3);
      }

      public static void main(String[] args) {
        Question2 q2 = new Question2();

    System.out.println(q2.stringE("Hello"));
    System.out.println(q2.stringE("Heel"));
    System.out.println(q2.stringE("Heeeel"));
      }
}
