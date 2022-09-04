/*          * 
            * 
            * 
            * 
  * * * * * * * * * * * 
            * 
            * 
            * 
            * 
 */

public class pro48 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 11; j++) {
                if (j == 6 || i == 5)
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
        pro48 print = new pro48();
        print.pattern();
    }
}
