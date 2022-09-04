/* 114. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a c program to produce third array Z by merging arrays X and Y in descending order  */

import java.util.*;

public class odevarray {
    int j = 0;

    public void m1()
    {
        int arrdemo[]= new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
        {
            arr1[j]=arr[i];
            j++;}
        }
        j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            arrdemo[j]=arr[i];
        }
        for(int k=arrdemo.length-1;k>=0;k--)
        {
            arr[]
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