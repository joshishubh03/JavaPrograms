/*
 * 3
 * 44
 * 555
 * 6666
 * 555
 * 44
 * 3
 */

class pro61 {
    public static void pattern() {// public static void main(String[] args) {
        int i = 3, j, k = 1;
        while (i != 2) {
            for (j = 2; j < i; j++) {
                System.out.print(i);
            }
            k++;
            if (k <= 4)
                i++;
            else
                i--;
            System.out.println();
        }

    }
}

class Test {
    public static void main(String[] args) {
        pro61 print = new pro61();
        print.pattern();
    }
}
