
// 42 WAP to calculate the reverse of any given number 
import java.util.*;

public class pro13 {
    public void Reverse() {
        Scanner s = new Scanner(System.in);
        int b, c = 0;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        while (count > 0) {
            b = count % 10;
            c = (c * 10) + b;
            count = count / 10;
        }
        System.out.println("reverse of number = " + c);
    }

}

class TestMain {
    public static void main(String[] args) {
        pro13 fact = new pro13();
        fact.Reverse();
    }
}
