/* 
        *            *
        * *        * * 
        *   *     *  *
        *     * *    *
        *      *     *
        *            *
        *            * 
        *            *
        *            *
      */

class pro86 {
  public static void M() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j == 1 || j == 9 || i < 6 && (i == j || j == 10 - i))
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
    pro86 print = new pro86();
    print.M();
  }
}