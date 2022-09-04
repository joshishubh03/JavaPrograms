/*
* * * * * * * * 
  *           *
    *         *
      *       *
        *     *
          *   * 
            * *
              *    */
class pro36 {
  public static void triangle() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (i == 1 || j == 8 || i == j)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}

class Test {
  public static void main(String[] args) {
    pro36 print = new pro36();
    print.triangle();
  }
}