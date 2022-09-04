
// 51 WAP to print all palindrome number from 101 to 199 
import java.util.*;

public class pro22 {
    public void allpalindrome() {
        Scanner s = new Scanner(System.in);
        int t = 0, b = 0, c = 0;
        for (int i = 101; i <= 199; i++) {
            t = i;
            while (t > 0) {
                b = t % 10;
                c = (c * 10) + b;
                t = t / 10;
            }
            if (c == i)
                System.out.println("Palindrome no is " + c);
            c = 0;
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro22 print = new pro22();
        print.allpalindrome();
    }
}
