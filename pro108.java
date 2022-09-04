/*                
     * * * * * *  
     *         *
     *         *
     * * * * * *
               *
               *
     * * * * * *
            
       
    */
class pro108 {
    public static void nine() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 6; j++) {

                if (i == 1 || j == 6 || i == 7 || i == 4 || j == 1 && i < 5)
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
        pro108 print = new pro108();
        print.nine();
    }
}