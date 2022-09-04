/*    
 ^ ^ ^ ^ ^   
^        ^   
^   ^    ^   
^     ^  ^   
^ ^ ^ ^  ^   
           ^
   

      */

class pro90 {
    public static void Q() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (((j == 1 || i == 1 || j == 5 || i == 5) && j < 6 && i < 6) || i > 2 && i == j)
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
        pro90 print = new pro90();
        print.Q();
    }
}