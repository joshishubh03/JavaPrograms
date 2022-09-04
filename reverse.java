
//85 Write a program to reverse the array.

import java.util.*;

class Reverse {
    private int ar[];

    public Reverse(int arr[]) {
        ar = arr;
    }

    public void revmethod() {
        int rev = ar.length - 1;
        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[rev];
            ar[rev] = temp;
            rev--;
        }
    }

    public void getter() {
        System.out.println(" ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Array element " + (1 + i) + " is ");
            System.out.println(ar[i]);
        }
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
        Reverse r = new Reverse(arr);
        r.revmethod();
        r.getter();
    }
}