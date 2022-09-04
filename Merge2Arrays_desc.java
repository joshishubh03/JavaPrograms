/* 114. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a c program to produce third array Z by merging arrays X and Y in descending order  */

import java.util.*;

public class Merge2Arrays_desc {
    public int[] Merge2Arrays(int arr1[], int arr2[]) {
        int n = (arr1.length) + (arr2.length);
        int arrdemo[] = new int[n];
        int demo = 0;
        for (int i = 0; i < arr1.length; i++) {
            arrdemo[demo] = arr1[i];
            demo++;
        }
        demo--;
        for (int i = 0; i < arr2.length; i++) {
            demo++;
            arrdemo[demo] = arr2[i];
        }
        return arrdemo;
    }

    public void desc_array1(int arr1[]) {
        int range = arr1.length - 1;
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[range];
            arr1[range] = arr1[i];
            arr1[i] = temp;
            range--;
        }
    }

    public void desc_array2(int arr2[]) {
        int range = arr2.length - 1;
        for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[range];
            arr2[range] = arr2[i];
            arr2[i] = temp;
            range--;
        }
    }

    public void Getarray(int arr3[]) {
        System.out.println("Array is ..");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st Array ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the size of 2nd Array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the values of 1st Array :");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the values of 2nd Array :");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n2 + n1];
        Merge2Arrays_desc Merge = new Merge2Arrays_desc();
        Merge.desc_array1(arr1);
        Merge.desc_array2(arr2);
        arr3 = Merge.Merge2Arrays(arr1, arr2);
        Merge.Getarray(arr3);
    }
}