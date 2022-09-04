/* 
        *     *
        *    *
        *   *
        *  *
        * *
        *  *
        *   *
        *    *
        *     *
      */

class pro84 {
  public static void K() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 6; j++) {
        if (j == 1 || j == 7 - i || i > 5 && j == i - 4)
          System.out.print("^");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}

class Test {
  public static void main(String[] args) {
    pro84 print = new pro84();
    print.K();
  }
}