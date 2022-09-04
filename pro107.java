/*                
     * * * * * 
    *         *
    *         *
    * * * * * *
    *         *
    *         *
      * * * * 
            
       
    */
class pro107 {
    public static void eight() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if ((j == 1 || j == 7) && (i > 1 && i < 7) || (i == 1 || i == 7) && (j > 1 && j < 7) || i == 4)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro107 print = new pro107();
        print.eight();
    }
}