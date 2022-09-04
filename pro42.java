/*
              *
            *   *
          *       *
        *           *
      *               *
    *                   *
  *                       *
* * * * * * * * * * * * * * *
*/
class pro42 {
  public void triangle() {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 15; j++) {
        if (i == 8 || j == 9 - i || j == 7 + i)
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
    pro42 print = new pro42();
    print.triangle();
  }
}