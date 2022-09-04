// 4 WAP to print the series 1 3 5 7 9....................n terms 

import java.util.*;

public class pro5 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        for (int i = 1; i < a; i += 2) {
            System.out.println(i);
        }
    }

}

class TestMain {
    public static void main(String[] args) {
        pro5 num = new pro5();
        num.printseries();
    }

}