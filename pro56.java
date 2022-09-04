/*
1 2 3 4 5
2     5
3   5
4 5
5
*/
class pro56 {
    // public static void main(String[] args) {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = i; j <= 5; j++) {
                if (i == j || j == 5 || i == 1)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro56 print = new pro56();
        print.pattern();
    }
}