/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1 0 1
0 1 0 1 0 1 0 1
*/
class pro65 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= i; j++) {
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
        pro65 print = new pro65();
        print.pattern();
    }
}