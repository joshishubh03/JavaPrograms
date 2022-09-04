
// 9.WAP to calculate the sum of given series 1 2 3 4 5 6 7 ................n terms 
import java.util.*;

public class pro9 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        for (int i = 1; i <= count; i++) {
            a = a + i;
        }
        System.out.println("sum is = " + a);
    }

}

class TestMain {
    public static void main(String[] args) {
        pro9 num = new pro9();
        num.printseries();
    }
}