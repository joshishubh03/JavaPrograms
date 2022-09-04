/*     * 
     * * * 
   * * * * * 
  * * * * * * 
   * * * * * 
     * * * 
       *       */
class pro49 {
    // public static void main(String[] args) {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if ((j >= 5 - i && j <= 3 + i) && i < 5 || (j >= i - 3 && j <= 11 - i) && i > 4)
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
        pro49 print = new pro49();
        print.pattern();
    }
}