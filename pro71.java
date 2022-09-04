/* 
       * * * * * * * * *
       * * * *   * * * *
       * * *       * * *
       * *           * *
       *               *
*/

class pro71 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 9; j++) {
                if (i > 1 && j > 6 - i && j < 4 + i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}

class Test {
    public static void main(String[] args) {
        pro71 print = new pro71();
        print.pattern();
    }
}