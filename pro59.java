/*
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1  */
class pro59 {
    public static void pattern() {// public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (int s = 5; s >= i; s--)
                System.out.print("  ");
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            if (i > 1) {
                for (k = i - 1; k >= 1; k--)
                    System.out.print(k + " ");
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
