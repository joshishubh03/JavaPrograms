/*               
        * * * * 
      *        *
    *         *
            *
          *
        *
      *
    * * * * * * *        
    */
class pro101 {
  public static void two() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 7; j++) {
        if (i > 1 && j == 8 - i || i == 8 || i == 1 && j > 3 && j < 7 || j == 4 - i && i < 4)
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
    pro101 print = new pro101();
    print.two();
  }
}