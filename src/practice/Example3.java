//package practice;

class Example3 {
    public static void main(String[] args) {
      int[][] twoD = new int[4][7];
  
      for (int i=0; i < twoD.length; i++) {
        for (int j=0; j < twoD[i].length; j++) {
          twoD[i][j] = i * j;
          System.out.print(twoD[i][j] + " - ");
          //System.out.print(twoD);
        }
  
        // here you'll print out a new line
        System.out.println();
      }
    }
  }
  