/*
**********1*********
 ********2*2********
 *******3*3*3*******
 ******4*4*4*4******
 ******5*5*5*5*5*****
 */
class pro60 {
    public static void pattern() {
        // public static void main(String[] args) {
        int i, j, a = 1, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 17; j++) {
                if (j >= 10 - i && j <= 8 + i) {
                    if (k == 1) {
                        System.out.print(a);
                        k = 0;
                    } else if (k == 0) {
                        System.out.print("*");
                        k = 1;
                    }
                } else {
                    System.out.print("*");
                }
            }
            a++;
            k = 1;
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro60 print = new pro60();
        print.pattern();
    }
}