
// Sub array with given sum
import java.util.*;

class Subarray {
    private int ar[];
    private int initial = -1;
    private int destination;

    public Subarray(int arr[]) {
        ar = arr;
    }

    public int Findsub(int ele) {
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                total = ar[j] + total;
                if (total == ele) {
                    initial = i;
                    initial++;
                    destination = j;
                    destination++;
                    return 0;
                }
            }
            total=0;
        }
        return 0;
    }

    public void getter() {
        if (initial != -1) {
            System.out.println("Initial Point is " + initial);
            System.out.println("destination Point is " + destination++);
        } else
            System.out.print("NO subarray is available");
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
        System.out.print("Enter the element Value ");
        int ele = sc.nextInt();
        Subarray s = new Subarray(arr);
        s.Findsub(ele);
        s.getter();
    }
}
