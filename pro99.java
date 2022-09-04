/*  * * * * * *
            *
          *
         *
       *
     *
   *
 * * * * * * *     

    */
class pro99 {
  public static void Z() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j == 8 - i || i == 1 || i == 8)
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
    pro99 print = new pro99();
    print.Z();
  }
}