/*    
   /*    
   *       *
   *       *
   *       *
   *       *
   * * * * *
    */
class pro94 {
    public static void U() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1 || j == 5)
                    System.out.print("^ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro94 print = new pro94();
        print.U();
    }
}