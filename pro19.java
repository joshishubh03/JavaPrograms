
// 48 WAP to calculate the sum of series 1/1! + 2/2! + 3/3!.......n\n! 
import java.util.*;

public class pro19 {
  public static void sumseries() {
    Scanner s = new Scanner(System.in);
    double total = 0;
    double fact = 1;
    System.out.print("Enter a number : ");
    int value = s.nextInt();
    for (int i = 1; i < value; i++) {
      fact = fact * i;
      total = (i / fact) + total;
      System.out.println(total);
    }
    System.out.println("total is :" + total);
  }

}

class TestMain {
  public static void main(String[] args) {
    pro19 calc = new pro19();
    calc.sumseries();
  }
}
