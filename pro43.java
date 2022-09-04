/*
      * * * * * * * * * * * * * * * 
        * * * * * * * * * * * * *
          * * * * * * * * * * *
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
*/
public class pro43 {
  public static void triangle() {
    // public static void main(String[] args) {
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 15; j++) {
        if (i == 1 || j >= i && j <= 16 - i)
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
    pro43 print = new pro43();
    print.triangle();
  }
}