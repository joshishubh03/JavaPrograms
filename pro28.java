//      *********
//     *********
//    *********
//   *********
//  *********
// ********* 

class pro28 {
    public static void tiltedpattern() {
        int i, j;
        for (i = 1; i < 7; i++) {
            for (j = 1; j < 15; j++) {
                if (i > 0 && j >= 7 - i && j <= 15 - i)
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
        pro28 print = new pro28();
        print.tiltedpattern();
    }
}
