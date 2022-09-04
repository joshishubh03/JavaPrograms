/*
Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing 
the order of positive element and negative element.	*/

import java.util.*;
class Arrange
{
    Scanner sc = new Scanner(System.in);
    private int arr[]= new int[0];
    public Arrange(int i[])
    {
        arr=i;
    }
    public int[] getter()
    {
        return arr;
    }
    public void arran(int arr2[],int n)
    {
        int arr1[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr2[i]>=0)
            arr1[j++]=arr2[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr2[i]<0)
            arr1[j++]=arr2[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
            }
        }
        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values of array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
     Arrange p = new Arrange(arr);
      p.arran(arr,n);
      int a[]=p.getter();
      System.out.println("Numbers are : ");
    for(int c : a)
    System.out.println(c);
          }
}