// 6 WAP to print the series 2 4 6 8 10..................n terms  

import java.util.*;

public class pro6 {
    void printseries() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        for (int i = 2; i < a; i += 2) {
            System.out.println(i);
        }
    }

}

class TestMain {
    public static void main(String[] args) {
        pro6 num = new pro6();
        num.printseries();
    }

}