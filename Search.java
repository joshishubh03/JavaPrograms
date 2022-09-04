
/*
111. P is one-dimensional array of integers. Write a C program search for a data VAL from P.
 If VAL is present in the array then the function should return value 1 and 0 otherwise. */
import java.util.*;

public class Search {
    public boolean Search(int arr[],int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return true;
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
        System.out.print("Enter the Element to Find ");
        int val = sc.nextInt();
        Search find = new Search();
        System.out.println(find.Search(arr,val));
    }
}