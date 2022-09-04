
// 8 . WAP to print the fibonacci series 0 1 1 2 3 5 8 13..........................n terms 
import java.util.*;

public class pro8 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        int a = 1, b = 0, c = 1;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        for (int i = 0; i < count; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }

}

class TestMain {
    public static void main(String[] args) {
        pro8 num = new pro8();
        num.printseries();
    }
}