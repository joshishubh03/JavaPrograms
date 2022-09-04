//       *********
//      *       * 
//     *       *  
//    *       *   
//   *       *             
//  *********  

class pro29 {
    public static void tiltedpattern() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 15; j++) {
                if (i > 0 && j == 7 - i || j == 15 - i || i == 1 && j > 5 || i == 6 && j < 9)
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
        pro29 print = new pro29();
        print.tiltedpattern();
    }
}