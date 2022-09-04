/* 
        * * * * 
           *  
           *  
           *  
        * * * *
      */

class pro82 {
   public static void I() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 5; j++) {
            if (j == 3 || i == 1 || i == 5)
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
      pro82 print = new pro82();
      print.I();
   }
}