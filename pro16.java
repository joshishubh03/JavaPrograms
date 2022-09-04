
// 45 WAP to to input a number and check it is prime or not 
import java.util.*;

public class pro16 {
    public void Primeno() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        int i = 2;
        while (i < count) {
            if (count % i == 0) {
                i = 0;
                break;
            }
            i++;
        }
        if (i != 0)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }

}

class TestMain {
    public static void main(String[] args) {
        pro16 prime = new pro16();
        prime.Primeno();
    }
}
