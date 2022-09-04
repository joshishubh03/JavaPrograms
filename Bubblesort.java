
/*119. Write a c program to implement bubble sort algorithm
*/
import java.util.*;

public class Bubblesort {
    public int[] Setarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
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
       Bubblesort sort = new Bubblesort();
        arr = sort.Setarray(arr);
        System.out.println("Sorted array is ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}