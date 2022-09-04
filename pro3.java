//. 2 Program to print 10 to 1 number using loop  
public class pro3 {
    void print10to1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        pro3 num = new pro3();
        num.print10to1();
    }

}
