/*               
       * * * * * 
              *
            *
          * * *
               *
               *
       *       *
         * * *        
    */
class pro102 {
  public static void three() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 7; j++) {
        if (i == 1 || j == 8 - i && i < 5 || i == 4 && j > 4 && j < 7 || i > 4 && j == 7 && i != 8)
          System.out.print("*");
        else if (i == 8 && j > 2 && j < 7 || i == 7 && j == 2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}

class Test {
  public static void main(String[] args) {
    pro102 print = new pro102();
    print.three();
  }
}