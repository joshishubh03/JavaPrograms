
// 49 WAP to print all prime number from 101 to 199
import java.util.*;

public class pro20 {
  public void primeornot() {
    Scanner s = new Scanner(System.in);
    int t = 0;
    for (int i = 101; i <= 200; i++) {
      for (int j = 2; j < i / 2; j++) {
        if (i % j == 0)
          t++;
      }
      if (t == 0)
        System.out.println(i);
      t = 0;
    }
  }
}

class TestMain {
  public static void main(String[] args) {
    pro20 prime = new pro20();
    prime.primeornot();
  }
}
