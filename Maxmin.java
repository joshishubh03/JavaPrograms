
//Find minimum and maximum element in array

import java.util.*;

class Maxmin {

    int ar[] = new int[6];
    int min = 245643244;
    int max = -245643244;
    Scanner sc = new Scanner(System.in);

    public Maxmin(int a[]) {
        for (int i = 0; i < a.length; i++)
            ar[i] = a[i];
    }

    public void Maxmin() {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
            if (ar[i] < min)
                min = ar[i];
        }
    }
}

class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of Array ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of Array ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        Maxmin mm = new Maxmin(arr);
        mm.Maxmin();
        System.out.println("Minimum is : " + mm.Getmin());
        System.out.println("Maximum is : " + mm.Getmax());
    }
}
//