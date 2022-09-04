
// 47 WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n 
import java.util.*;

public class pro18 {
  public void calcsum() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int value = s.nextInt();
    System.out.print("Enter the terms ");
    int term = s.nextInt();
    int i = 1, total = 0;
    System.out.println(1);
    while (i <= term) {
      total = (i * value) + total;
      System.out.println((i * value));
      i++;
    }
    total++;
    System.out.println("power of the given number is " + total);
  }

}

class TestMain {
  public static void main(String[] args) {
    pro18 calc = new pro18();
    calc.calcsum();
  }
}
