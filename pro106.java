/*                
    * * * * * * 
             * 
            * 
           *  
          * 
         *  
       
    */
class pro106 {
    public static void seven() {
        int k = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {

                if (i == 1 || j == 7 - i)
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
        pro106 print = new pro106();
        print.seven();
    }
}