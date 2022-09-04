
// 9 WAP to calculate the sum of given series 2 4 6 8 10.....................n terms
import java.util.*;

public class pro10 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        for (int i = 1; i <= count; i += 2) {
            a = a + i;
        }
        System.out.println("sum is = " + a);
    }

}

class TestMain {
    public static void main(String[] args) {
        pro10 num = new pro10();
        num.printseries();
    }
}