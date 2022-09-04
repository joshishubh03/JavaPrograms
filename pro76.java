/* 
        * * * 
      *
      * 
      *
        * * *
      */

class pro76 {
  public static void C() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j == 1 && i > 1 && i < 5 || (i == 1 || i == 5) && j > 1)
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
    pro76 print = new pro76();
    print.C();
  }
}