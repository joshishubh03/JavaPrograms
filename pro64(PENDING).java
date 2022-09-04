/* *
   * *
   * 1 *
   * 1 2 1 *
   * 1 2 3 2 1 *              //PENDING
   * 1 2 1 *
   * 1 *
   *              */
class pro64 {
    public static void main(String[] args) {
        int i = 1, j, a = 1;
        for (i = 1; i <= 8; i++) {
            System.out.print("*");
            for (j = 1; j <= i; j++) {
                if ((i <= 5 && i == j) || j == 1)
                    System.out.print("*");
                else if (j == 6 - a) {
                    System.out.print("*");
                    a += 2;
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}