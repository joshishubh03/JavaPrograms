/*
* * * * * * * *
  * * * * * * *
    * * * * * *
      * * * * *
        * * * *
          * * *
            * *
              *  
*/
class pro39 {
  public static void triangle() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (i == 1 || j == 8 || j >= i)
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
    pro39 print = new pro39();
    print.triangle();
  }
}