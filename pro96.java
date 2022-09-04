/*    
   /*    
    *           *
     *         *
      *   *   *
       * * * *
        *   *
    */
class pro96 {
    public static void W() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 16; j++) {
                if (i == j || j == 16 - i || j == 9 - i || j == 7 + i)
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
        pro96 print = new pro96();
        print.W();
    }
}