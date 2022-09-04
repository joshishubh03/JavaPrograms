/*1
 121
 12321
 1234321
123454321
*/

class pro70 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (int sp = 5; sp >= i; sp--)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1)
                for (int k = i - 1; k > 0; k--)
                    System.out.print(k);
            System.out.println();
        }

    }
}

class Test {
    public static void main(String[] args) {
        pro70 print = new pro70();
        print.pattern();
    }
}