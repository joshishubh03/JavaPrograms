/* Q.101) Find largest sum contigeous sub array
Given an array Arr[] of N integers.
 Find the contiguous sub-array(containing at least one number)
  which has the maximum sum and return its sum.
  */


import java.util.*;
class Largestsum
      {
    Scanner sc = new Scanner(System.in);
    public int Largestsum(int arr1[])
    { 
        int sum=0,max=-2147483648;
        for(int i=0;i<arr1.length;i++)
        {   sum=0; 
            for(int j=i;j<arr1.length;j++)
            {
                sum=sum+arr1[j];
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
     Largestsum pair = new Largestsum();
          System.out.print("Output is : "+pair.Largestsum(arr));
    }   
} 