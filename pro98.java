/*  *         *
     *       *
      *     *
       *   *
        * *
         *
         *
         *
         *
    */
class pro98 {
    public static void Y() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 11; j++) {
                if ((i == j || j == 12 - i) && i <= 5 || j == 6)
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
        pro98 print = new pro98();
        print.Y();
    }
}