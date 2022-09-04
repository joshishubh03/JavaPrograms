/*10001
  01010
  00100
  01010
  10001   */
class pro68 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == j || j == 6 - i)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();

        }
    }
}

class Test {
    public static void main(String[] args) {
        pro68 print = new pro68();
        print.pattern();
    }
}