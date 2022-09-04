/*  A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA   */

class pro58 {
    public static void pattern() {

        char i, j, k, c;
        for (i = 'A'; i <= 'E'; i++) {
            for (char s = 'E'; s > i; s--)
                System.out.print(" ");
            for (j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 'A') {
                c = --i;
                i++;
                for (k = c; k >= 'A'; k--)
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro58 print = new pro58();
        print.pattern();
    }
}