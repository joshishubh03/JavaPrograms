
// 43 WAP to input a number and check it palindrome or not
import java.util.*;

public class pro15 {
    public void palindrome() {
        Scanner s = new Scanner(System.in);
        int b, c = 0, dupli;
        System.out.print("Enter a number : ");
        int count = s.nextInt();
        dupli = count;
        while (count > 0) {
            b = count % 10;
            c = (c * 10) + b;
            count = count / 10;
        }
        if (c == dupli)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }

}

class TestMain {
    public static void main(String[] args) {
        pro15 palin = new pro15();
        palin.palindrome();
    }
}