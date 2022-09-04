/* 
        * * * * 
           *  
           *  
        *  *  
        * * 
      */

class pro83 {
   public static void J() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 5; j++) {
            if (i == 1 || j == 3 && i != 5 || i == 5 && j < 3 || i == 4 && j == 1)
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
      pro83 print = new pro83();
      print.J();
   }
}