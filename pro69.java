/* 1
   11
   121
   1221
   12221 
   */
class pro69 {
    public static void pattern() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (i > 1 && j > 1 && j < i)
                    System.out.print("2");
                else
                    System.out.print("1");
            }
            System.out.println();

        }
    }
}

class Test {
    public static void main(String[] args) {
        pro69 print = new pro69();
        print.pattern();
    }
}