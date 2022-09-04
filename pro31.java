// ********     
//  *      *    
//   *      *   
//    *      *
//     *      *
//      ********

class pro31 {
    public static void tiltedpattern() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 15; j++) {
                if (i > 0 && j == i + 1 || j == 8 + i || i == 1 && j < 9 && j != 1 || i == 6 && j > 6)
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
        pro31 print = new pro31();
        print.tiltedpattern();
    }
}