//. 2 Program to print 1 to 10 number using loop 
public class pro2 {
    void print1to10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro2 num = new pro2();
        num.print1to10();
    }

}
