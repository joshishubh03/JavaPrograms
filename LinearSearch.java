
/*119. Write a c program to implement bubble sort algorithm
*/
import java.util.*;

public class LinearSearch {
    public boolean Setarray(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == val) {
                    return true;
                }
            }
        }
        return false;
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
        System.out.println("Enter the Element to Search ");
        int val = sc.nextInt();
        LinearSearch Ls = new LinearSearch();
        System.out.println(Ls.Setarray(arr, val));

    }
}