//  ********     
//   ********    
//    ********   
//     ********  
//      ******** 
//       ********

class pro30 {
    public static void tiltedpattern() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 15; j++) {
                if (i > 0 && j < 9 + i && j >= 1 + i)
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
        pro30 print = new pro30();
        print.tiltedpattern();
    }
}