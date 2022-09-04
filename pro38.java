/*
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*  
*/
class pro38 {
    public static void triangle() {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                if (i == 8 || j == 1 || j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro38 print = new pro38();
        print.triangle();
    }
}