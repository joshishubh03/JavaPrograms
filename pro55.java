/*
      1
     1 2
    1   3
   1     4
  1 2 3 4 5
 */
class pro55 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j, a = 1;
        for (i = 1; i <= 5; i++) {
            for (int z = 6; z > i; z--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == i || j == 1 || i == 5)
                    System.out.print(" " + j);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro55 print = new pro55();
        print.pattern();
    }
}