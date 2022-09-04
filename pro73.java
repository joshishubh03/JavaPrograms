/* 
       *
      * *
     * * * 
    * * * *
   * * * * * 
    * * * *
     * * *
      * *
       * 
*/
class pro73 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                if ((j >= 6 - i && j <= 4 + i && i < 6) || (j >= i - 4 && j <= 14 - i && i > 5))
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
        pro73 print = new pro73();
        print.pattern();
    }
}
