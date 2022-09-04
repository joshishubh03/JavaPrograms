/* 
* * * * 
*      
* * * *  
*       
* 
      */

class pro79 {
    public static void F() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1)
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
        pro79 print = new pro79();
        print.F();
    }
}