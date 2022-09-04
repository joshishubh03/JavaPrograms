// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
class pro32 {
    public static void triangle() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro32 print = new pro32();
        print.triangle();
    }
}