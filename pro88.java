/*        * * * * *  
        *            *
        *            *
        *            *
        *            *
          * * * * * 
      */

class pro88 {
  public static void O() {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if ((i == 6 || i == 1) || (j == 1 || j == 6))
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
    pro88 print = new pro88();
    print.O();
  }
}