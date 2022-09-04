/*112. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a c program to search for an integer from AR with the help of Binary search method, returning an integer 0 to show absence of the number and integer 1 to show presence of the number in the array. */

import java.util.*;

public class BinarySearch {
    public int BinarySearch(int arr[], int ele) {
        int mid;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == ele)
                break;
            else if (ele > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (low > high)
            return 0;
        else
            return 1;
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
        System.out.print("Enter the Element to Find ");
        int val = sc.nextInt();
        BinarySearch find = new BinarySearch();
        System.out.println(find.BinarySearch(arr, val));
    }
}