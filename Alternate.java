
import java.util.*;

class Alternate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter the values of array ");
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) {
                arr1[a] = arr[i];
                a++;
            } else {
                arr2[b] = arr[i];
                b++;
            }
        }
        a = 0;
        b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr1[a] == 0) {
                    System.out.println("here");
                    arr[i] = arr2[b];
                    b++;
                } else {
                    arr[i] = arr1[a];
                    a++;
                }
            } else {
                if (arr2[b] == 0) {
                    System.out.println("here");
                    arr[i] = arr1[a];
                    a++;
                } else {
                    arr[i] = arr2[b];
                    b++;
                }
            }
        }
        System.out.println("Values are ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
