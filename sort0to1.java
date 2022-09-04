// Sort the array of 0s , 1s and 2s.

// Find occurance of an integer number in array.
import java.util.*;

class sort0to1 {
    private int ar[];

    public sort0to1(int arr[]) {
        ar = arr;
    }

    public void Sort() {
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
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Elements are : " + ar[i] + "\n");
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
        int occur;
        sort0to1 s = new sort0to1(arr);
        s.Sort();
        s.getter();
    }
}
