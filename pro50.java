/*
*            *
 *          *
  *        *
   *      *
    *    *
     *  *
      **
      **
     *  *
    *    *
   *      *
  *        *
 *          *
*            *
         
                    */

class pro50 {
    // public static void main(String[] args) {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 14; i++) {
            for (j = 1; j <= 15; j++) {
                if (j == i || j == 15 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro50 print = new pro50();
        print.pattern();
    }
}