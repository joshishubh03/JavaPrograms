/* 
  * * * * *
    * * * *
      * * *
        * *
          *
        * *
      * * *
    * * * *
  * * * * *
   */

class pro45 {
  public static void pattern() {
    // public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 5; j++) {
        if ((j >= i && i < 6) || j >= 11 - i)
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
    pro45 print = new pro45();
    print.pattern();
  }
}