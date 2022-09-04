// 52 WAP to print all armstrong number from 101 to 999

import java.util.*;

public class pro23 {
    public void allarmstrong() {
        Scanner s = new Scanner(System.in);
        int t = 0, b = 0, c = 0;
        for (int i = 101; i <= 199; i++) {
            t = i;
            while (t > 0) {
                b = t % 10;
                c = c + (b * b * b);
                t = t / 10;
            }
            if (c == i)
                System.out.println("Armstrong no is " + c);
            c = 0;
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro23 print = new pro23();
        print.allarmstrong();
    }
}