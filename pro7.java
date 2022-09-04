// WAP to print the series 1 4 9 16 25................n terms

import java.util.*;

public class pro7 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println((i * i));
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro7 num = new pro7();
        num.printseries();
    }
}