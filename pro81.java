/* 
        *     * 
        *     *  
        * * * *  
        *     *  
        *     * 
      */

class pro81 {
  public static void H() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j == 1 || i == 3 || j == 5)
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
    pro81 print = new pro81();
    print.H();
  }
}