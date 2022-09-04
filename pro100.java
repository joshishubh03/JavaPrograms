/*       *
      *  *
    *    * 
         * 
         * 
         * 
         * 
    * * * * * * 
    */
class pro100 {
    public static void one() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 4 || i == 8 || j == 4 - i)
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
        pro100 print = new pro100();
        print.one();
    }
}