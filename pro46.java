/*    *
      * * 
      * * *
      * * * *
      * * * * *
      * * * * 
      * * * 
      * * 
      *   
 */

class pro46 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                if (i < 5 || j < 11 - i)
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
        pro46 print = new pro46();
        print.pattern();
    }
}