
//  Write a program to sort the array
import java.util.*;

class Sorting {
    private int ar[];

    public Sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            ar[i] = arr[i];
    }

    public void sortmethod() {
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
        Sorting s = new Sorting(arr);
        s.sortmethod();
        s.getter();
    }
}
