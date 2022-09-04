/* Q.100 Find it there is any subarray with sum equals to zero
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
*/
import java.util.*;
class Sumzero
      {
    Scanner sc = new Scanner(System.in);
    public boolean Paircount(int arr1[])
    { 
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {   
            for(int j=i;j<arr1.length;j++)
            {
                sum=sum+arr1[j];
                if(sum==0)
                {
                  return true;
                }
            }
            sum=0;
        }
    return false;
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
     Sumzero pair = new Sumzero();
          System.out.print(pair.Paircount(arr));
    }   
} 