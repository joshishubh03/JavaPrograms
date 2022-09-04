//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5
class pro25 {
    public void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

class TestMain {
    public static void main(String[] args) {
        pro25 print = new pro25();
        print.pattern();
    }
}