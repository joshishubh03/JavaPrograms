/* 
      *
     * *
    *****
   *     *
  *       *    */

class A {
    public static void A() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i || j == 4 + i || i == 3 && j > 2 && j < 8)
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
        A print = new A();
        print.A();
    }
}