/*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
    * * * * * * * * * * *
  * * * * * * * * * * * * *
* * * * * * * * * * * * * * *
*/
class pro41 {
  public void triangle() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 15; j++) {
        if (i == 11 || j >= 9 - i && j <= 7 + i)
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
    pro41 print = new pro41();
    print.triangle();
  }
}