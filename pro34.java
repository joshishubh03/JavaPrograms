// *     
// * *
// *   *
// *     *
// *       *
// * * * * * *

class pro34 {
    public static void triangle() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (j == 1 || i == 6 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro34 print = new pro34();
        print.triangle();
    }
}