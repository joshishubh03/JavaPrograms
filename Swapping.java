import java.util.*;

class Swapping {
    public Swapping(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public void Getarray(int arr[]) {
        System.out.println("values are ...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
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
        Swapping swap = new Swapping(arr);
        swap.Getarray(arr);
    }
}