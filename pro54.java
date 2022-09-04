/*      1
      2 3 2
    3 4 5 4 3
   4 5 6 7 6 5 4 
 5 6 7 8 9 8 7 6 5 */

class pro54 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j, a = 1;
        for (i = 1; i <= 5; i++) {
            for (int z = 6; z > i; z--) {
                System.out.print("  ");
            }
            for (j = i; j <= a; j++)
                System.out.print(" " + j);
            if (i > 1) {
                for (int k = a - 1; k >= i; k--)
                    System.out.print(" " + k);
            }
            System.out.println();
            a += 2;
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro54 print = new pro54();
        print.pattern();
    }
}