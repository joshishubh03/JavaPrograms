
// 46 WAP to calculate the power of a number  
import java.util.*;

public class pro17 {
  public void Calcpower() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int value = s.nextInt();
    System.out.print("Enter the power ");
    int power = s.nextInt();
    int i = 1, total = value;
    while (i < power) {
      total = total * value;
      i++;
    }
    System.out.println("power of the given number is " + total);
  }

}

class TestMain {
  public static void main(String[] args) {
    pro17 pow = new pro17();
    pow.Calcpower();
  }
}