package practice;
public class Example1 {
    public static void main(String[] args) {
      double x = 18.234;
      // double "x" is being cast to an (int) "z" below
      // more examples
      int z = (int) x;

      double d = 100.04;
      // cast double "d" to long "l" - explicit type casting required
      long l = (long)d;
      // cast long "l" to int "i" - explicit type casting required
      int i = (int)l;
      System.out.println("Long value " + l);
      System.out.println("int z value " + z);
      System.out.println("int value " + i);

      int a = 100;
      // convert int "a" to long "l" - no explicit type casting required
      long m = a;    
      // convert long "l" to float "f" - no explicit type casting required
      float f = m; 
      System.out.println("Int a value "+a);      
      System.out.println("Long m value "+m);
      System.out.println("Float f value "+f);

      // Example of narrow casting
      double w = 18.23458;
      int u = (int) w;
      System.out.println("int w value "+w);
      System.out.println("int u value "+u);

    }
  }
  
