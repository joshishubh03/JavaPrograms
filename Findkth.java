
//  Write a program to sort the array
import java.util.*;

class Findkth {
    private int ar[];

    public Findkth(int arr[]) {
        ar = arr;
    }

    public void Find() {
        int temp;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

    public void getlarge(int large) {
        System.out.println(" ");
        System.out.println("kth Large element is :" + ar[(ar.length - large)]);
    }

    public void getsmall(int small) {
        System.out.println(" ");
        System.out.println("kth Small element is :" + ar[(small - 1)]);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of Array ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of Array \n");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        int large, small;
        System.out.print("Enter the kth Element for Largest ");
        large = sc.nextInt();
        System.out.print("Enter the kth Element for Smallest ");
        small = sc.nextInt();
        Findkth s = new Findkth(arr);
        s.Find();
        s.getlarge(large);
        s.getsmall(small);
    }
}
