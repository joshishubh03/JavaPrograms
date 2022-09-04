//       *
//      ** 
//     * *
//    *  *
//   *   *
//  *    *
// *******
class pro35 {
    public static void triangle() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= 7; j++) {
                if (j == 7 || i == 1 || i == j)
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
        pro35 print = new pro35();
        print.triangle();
    }
}