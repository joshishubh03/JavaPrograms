
/*}
110. Write a menu driven C  program with following option 
a. Accept elements of an array 
b. Display elements of an array 
c. Sort the array using insertion sort method 
d. Sort the array using selection sort method 
e. Sort the array using bubble sort method 

 */
import java.util.*;

public class menu {
    public void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
    }

    public void Getarray() {
        System.out.println("Elements of Array is....");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public void Selectionsort(int arr[]) {

    }

    public void Bubblesort(int arr[]) {

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
        Largesmall ls = new Largesmall();
        ls.Getlargesmall(arr);
        System.out.println("Largest  Element in the array : " + ls.Getmax());
        System.out.println("Smallest Element in the array : " + ls.Getmin());
    }
}