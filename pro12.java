
// 12 .WAP to program to calculate the factorial of any given number
import java.util.*;

public class pro12 {
    public void calcfact() {
        Scanner s = new Scanner(System.in);
        int a = 0, fact = 1;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        for (int i = 1; i <= count; i++) {
            fact = i * fact;
        }
        System.out.println("factorial  is = " + fact);
    }

}

class TestMain {
    public static void main(String[] args) {
        pro12 fact = new pro12();
        fact.calcfact();
    }
}
