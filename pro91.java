/*    
    * * * * * 
   *          *
   *          *
   *         *
   * * * * * 
   *         *
   *          *
   *           *
      */
class pro91 {
    public static void R() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j == 1 || (i == 1 || i == 5) && j < 5 || i > 4 && j == i || i > 1 && j == 5 && i < 5)
                    System.out.print(" ^");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro91 print = new pro91();
        print.R();
    }
}