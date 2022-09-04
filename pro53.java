/* 1
   1 2
   1   3
   1     4
   1 2 3 4 5   */

class pro53 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (j > 1 && j != i && i < 5)
                    System.out.print("  ");
                else
                    System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro53 print = new pro53();
        print.pattern();
    }
}