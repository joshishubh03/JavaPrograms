/*    
   /*    
   ^ ^ ^ ^ ^ 
       ^     
       ^     
       ^     
       ^ 
    */
class pro93 {
    public static void T() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 3)
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
        pro93 print = new pro93();
        print.T();
    }
}