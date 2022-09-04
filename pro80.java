/* 
        * * * * 
        *      
        *   * *  
        *     *  
        * * * * 
      */

class pro80 {
    public static void G() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5 && i != 2 || i == 3 && j != 2)
                    System.out.print("^");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro80 print = new pro80();
        print.G();
    }
}