
// 44 WAP to to input 3 digit number and check it is armstrong or not 
import java.util.*;

public class pro14 {
    public void armstrong() {
        Scanner s = new Scanner(System.in);
        int b, c = 0, dupli;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        dupli = count;
        while (count > 0) {
            b = count % 10;
            c = c + (b * b * b);
            count = count / 10;
        }
        if (c == dupli)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");
    }

}

class TestMain {
    public static void main(String[] args) {
        pro14 arm = new pro14();
        arm.armstrong();
    }
}
