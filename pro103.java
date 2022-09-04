/*               
       *     *
       *     * 
       *     * 
       * * * * 
             * 
             * 
             *     
    */
class pro103 {
    public static void four() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 4 || i == 4 || j == 1 && i < 5)
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
        pro103 print = new pro103();
        print.four();
    }
}