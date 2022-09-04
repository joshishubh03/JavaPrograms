/*
1
121
12321
1234321
123454321

 */
class pro57 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1)
                for (k = i - 1; k >= 1; k--)
                    System.out.print(k);
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro57 print = new pro57();
        print.pattern();
    }
}