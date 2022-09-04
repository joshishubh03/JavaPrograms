// 53. * * * * * * *
//     * * * * * * *
//     * * * * * * *
//     * * * * * * *
//     * * * * * * *
//     * * * * * * *

import java.util.*;

public class pro24 {
    public void square() {
        Scanner s = new Scanner(System.in);
        int t = 0, b = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro24 print = new pro24();
        print.square();
    }
}