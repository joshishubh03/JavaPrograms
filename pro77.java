/* 
* * * * 
*      *
*      * 
*      * 
* * * *
      */

class pro77 {
    public static void D() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 5) && j != 5 || i > 1 && i < 5 && j == 5 || j == 1)
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
        pro77 print = new pro77();
        print.D();
    }
}