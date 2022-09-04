/*    
   /*    
  ^               ^ 
    ^           ^   
      ^       ^     
        ^   ^       
          ^     
    */
class pro95 {
  public static void V() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i == j || j == 10 - i)
          System.out.print("^ ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}

class Test {
  public static void main(String[] args) {
    pro95 print = new pro95();
    print.V();
  }
}