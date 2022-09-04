/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
class pro52 {
    // public static void main(String[] args) {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 6 - i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro52 print = new pro52();
        print.pattern();
    }
}