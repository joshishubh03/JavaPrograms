/*                
 *     * * * * *
 *     *       *
 *     *       *
 *     *       *
 *     *       *
 *     *       *
 *     * * * * *
    */
class pro109 {
    public static void ten() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {

                if (j == 1 || j == 4 || i == 1 && j > 4 || j == 8 || i == 7 && j > 4)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro109 print = new pro109();
        print.ten();
    }
}