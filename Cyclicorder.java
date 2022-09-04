/*
arrange in cyclic order
*/

import java.util.*;
class CyclicOrder
      {
    Scanner sc = new Scanner(System.in);
    private int arr[]= new int[0];
    private int count=0;
    public CyclicOrder(int i[])
    {
        arr=i;
    }
    public int[] getOrder()
    {
        return arr;
    }
    public void Setorder(int arr1[])
    {
        int temp;
        for(int i=arr1.length-1;i>0;i--)
        {
            temp =arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
            }
        }

        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Array size ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values of 1st array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
                }
     CyclicOrder Cyclic = new CyclicOrder(arr);
      Cyclic.Setorder(arr);
      int cyclicarr[] = Cyclic.getOrder();
      for(int i=0;i<n;i++)
      System.out.println("Values are : "+cyclicarr[i]);
    }
} 