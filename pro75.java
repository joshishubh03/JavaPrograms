/* 
      * * * 
      *     *
      * * * 
      *     *
      * * * 
      
      */

class pro75 {
    public static void B() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1 || i % 2 == 1 && j < 4 || i % 2 == 0 && j == 5)
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
        pro75 print = new pro75();
        print.B();
    }
}