/* 
       *                 *
       * *             * *
       * * *         * * *
       * * * *     * * * *
       * * * *  *  * * * *
*/

class pro72 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 9; j++) {
                if (j >= i + 1 && j <= 9 - i)
                    System.out.print("  ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro72 print = new pro72();
        print.pattern();
    }
}
