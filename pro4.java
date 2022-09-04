
// 4. WAP to print the series 1 2 3 4 5 ...................n
import java.util.*;

public class pro4 {
    void print_1_to_n() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        for (int i = 1; i < a; i++) {
            System.out.println(i);
        }
    }

}

class TestMain {
    public static void main(String[] args) {
        pro4 num = new pro4();
        num.print_1_to_n();
    }

}