
// 11. WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms
import java.util.*;

public class pro11 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        int a = 0, total = 0;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        for (int i = 1; i <= count; i++) {

            if (i % 2 == 0) {
                a = (i - i) - i;
            } else
                a = i;
            total = a + total;
        }
        System.out.println("sum is = " + total);
    }

}

class TestMain {
    public static void main(String[] args) {
        pro11 num = new pro11();
        num.printseries();
    }
}
