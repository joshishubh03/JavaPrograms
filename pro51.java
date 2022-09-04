/*1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5 */

class pro51 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro51 print = new pro51();
        print.pattern();
    }
}