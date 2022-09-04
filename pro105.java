/*                
       * * * * 
       * 
       * 
       * * * * 
       *     *
       *     * 
       * * * *      
    */
class pro105 {
    public static void six() {
        int k = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i == 1 || i == 4 || i == 7 || j == 1 || j == 4 && i > 3)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro105 print = new pro105();
        print.six();
    }
}