// &&&&&&&&&
// & &   & &
// &  & &  &
// &   &   &
// &  & &  &
// & &   & &
// &&&&&&&&&

public class pro27 {

    public void pattern() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 1 || j == 9 || i == 7 || j == 1 + i || j == 9 - i)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro27 print = new pro27();
        print.pattern();
    }
}
