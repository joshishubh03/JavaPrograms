/*
1                 //k=2 i=2
2*2               //k=3 i=3
3*3*3             //k=4 i=4
4*4*4*4           //k==5 i=4
4*4*4*4           //k==6 i=3
3*3*3             //k==7 i=2
2*2               //k==8 i=1
1*/ //k==9 i=0
class pro62 {
    public static void pattern() {// public static void main(String[] args) {
        int i = 1, j, k = 2;
        while (i != 0) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
                if (i > 1 && j != i)
                    System.out.print("*");
            }
            if (k <= 4)
                i++;
            else if (k == 5)
                i = k - 1;
            else
                i--;
            System.out.println();
            k++;
        }
    }
}

class Test {
    public static void main(String[] args) {
        pro62 print = new pro62();
        print.pattern();
    }
}
