/*                
       * * * * 
       * 
       * 
       * * * 
             *
             * 
       * * *       
    */
class pro104 {
    public static void five() {
        int k = 3;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || (j == 1 && i < 5) || (i == 4 || i == 7) && j != 4 || i > 4 && i < 7 && j == 4)

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
        pro104 print = new pro104();
        print.five();
    }
}