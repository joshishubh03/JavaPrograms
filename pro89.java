/*    
   * * * * * 
   *         *
   *         *
   *         *
   * * * * * 
   *
   *
   *

      */

class pro89 {
   public static void P() {
      for (int i = 1; i <= 8; i++) {
         for (int j = 1; j <= 6; j++) {
            if (j == 1 || (i == 1 || i == 5) && j != 6 || j == 6 && i > 1 && i < 5)
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
      pro89 print = new pro89();
      print.P();
   }
}