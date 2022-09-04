
// 50 WAP to print the reverse of all number from 101 to 199 
import java.util.*;

public class pro21 {
    public void reverseall() {
        Scanner s = new Scanner(System.in);
        int t = 0, b = 0, c = 0;
        for (int i = 101; i <= 200; i++) {
            t = i;
            while (t > 0) {
                b = t % 10;
                c = (c * 10) + b;
                t = t / 10;
            }
            if (i % 10 == 0)
                System.out.println("Reverse of " + i + "is 0" + c);
            else
                System.out.println("Reverse of " + i + "is " + c);
            c = 0;
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro21 print = new pro21();
        print.reverseall();
    }
}
