/* 10101
   01010
   10101
   01010
   10101   */
class pro67 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i + j) % 2 == 0)
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
        pro67 print = new pro67();
        print.pattern();
    }
}