/*
         * 1
         * 2*3
         * 4*5*6
         * 7*8*9*10 //PENDING
         * 7*8*9*10
         * 4*5*6
         * 2*3
         * 1
         */
class pro63 {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 0; i < 8; i += 2) {
            for (int j = 0; j <= i; j++) {

                if (j % 2 == 1)
                    System.out.print("*");
                else {
                    System.out.print(c);
                    c++;
                }

            }
            System.out.println();
        }

        c = 7;
        int d = 4;
        for (int i = 8; i > 0; i -= 2) {
            if (i == 4)
                d = 3;
            for (int j = 1; j < i; j++) {

                if (j % 2 == 0)
                    System.out.print("*");
                else {
                    System.out.print(c);
                    c++;
                }
            }
            c = i - d;
            System.out.println();
        }
    }
}