/* 
        *            *
        * *          * 
        *   *        *
        *     *      *
        *      *     *
        *        *   *
        *         *  * 
        *          * *
        *            *
      */

class pro87 {
  public static void N() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j == 1 || j == 9 || i == j)
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
    pro87 print = new pro87();
    print.N();
  }
}