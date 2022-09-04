/*  Find Maximum product contigeous sub array 
Given an array Arr[] that contains N integers (may be positive, negative or zero).
 Find the product of the maximum product subarray. */

import java.util.*;
class Maxproduct
      {
    Scanner sc = new Scanner(System.in);
    public int Maxproduct(int arr1[])
    { 
        int sum=1,max=-2147483648;
        for(int i=0;i<arr1.length;i++)
        {   sum=1; 
            for(int j=i;j<arr1.length;j++)
            {
                sum=sum*arr1[j];
            if(sum>max)
                {
                    max=sum;
                }
            }
           
        }
    return max;
    }
}
        class TestMain {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println(" ");
        System.out.println("Enter the values of 1st array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
                }
    Maxproduct pair = new Maxproduct();
          System.out.print("Output is : "+pair.Maxproduct(arr));
    }   
} 