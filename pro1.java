//. Program to print 10 times hello on output screen using loop

public class pro1 {
    public void printhello() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro1 hello = new pro1();
        hello.printhello();
    }
}