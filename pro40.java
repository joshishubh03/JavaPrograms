/*
* * * * * * * * 
*             * 
*             * 
*             * 
*             * 
*             *
*             *
* * * * * * * *
*/
class pro40 {
    public static void square() {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                if (i == 8 || j == 1 || j == 8 || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}

class Test {
    public static void main(String[] args) {
        pro40 print = new pro40();
        print.square();
    }
}