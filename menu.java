import java.util.*;

class menu {
    public int[] insertionmethod(int array[]) {
        int n = array.length;
        int i;
        int val;
        for (int j = 1; j < n; j++) {
            val = array[j];
            i = j - 1;
            while (i > -1 && array[i] > val) {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = val;
        }
        return arr;
    }

    public int[] selectionmethod(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int n = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[n]) {
                    n = j;// searching for lowest index
                }
            }
            int small = arr[n];
            arr[n] = arr[i];
            arr[i] = n;
        }
        return arr;

    }

    public int[] Bubblesortmethod(int arr[]) {
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
        menu sort = new menu();
        arr = sort.insertionmethod(arr);
        System.out.println("Sorted array is ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        arr = sort.selectionmethod(arr);
        System.out.println("Sorted array is ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        arr = sort.Bubblesortmethod(arr);
        System.out.println("Sorted array is ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
