/*
2
3 5
7 11 13
17 19 23 29
31 37 41 43 47
*/
class pro66 {
    public static void pattern() {
        int c = 0;
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[c] + " ");
                c++;
            }
            System.out.println();
        }
    }

}

class Test {
    public static void main(String[] args) {
        pro66 print = new pro66();
        print.pattern();
    }
}