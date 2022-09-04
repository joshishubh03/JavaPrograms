import java.util.*;

public class Reverse1D {
    public void Setarray(int arr[]) {
        int range = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[range];
            arr[range] = arr[i];
            arr[i] = temp;
            range--;
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse1D swap = new Reverse1D();
        swap.Setarray(arr);
        System.out.println("Reversed array is ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}