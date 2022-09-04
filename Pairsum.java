 /* que 94 .Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.*/

/*
arrange in cyclic order
*/
import java.util.*;
class Pairsum
      {
    Scanner sc = new Scanner(System.in);
    private int arr[]= new int[0];
    private int count=0;
    private int val;
    public Pairsum(int i[],int val)
    {
        arr=i;
        this.val = val;
    }
    public int getpairs()
    {
        return count;
    }
    public void GetPaircount(int arr1[])
    { 
        int sum;
        for(int i=0;i<arr1.length;i++)
        {   
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]+arr[j]==val)
                {
                count++;}
               // else if(sum>val)break;
        }
        sum=0;
    }
        }
    }

        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the Number ");
        int val= sc.nextInt();
        System.out.println(" ");
        System.out.println("Enter the values of 1st array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
                }
     Pairsum pair = new Pairsum(arr,val);
           pair.GetPaircount(arr);
      int count = pair.getpairs();
      System.out.println("Pairs are : "+count);
    }
} 