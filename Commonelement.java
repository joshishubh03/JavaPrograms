/*  Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.*/

 /* que 94 .Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.*/

/*
arrange in cyclic order
*/
import java.util.*;
class Commonelement
      {
    Scanner sc = new Scanner(System.in);
    private int arrcount[];
    private int val;
    private int c=0;

    public void getcommonele()
    {
        for(int i=0;i<c;i++)
        System.out.println("Common Elements are : "+arrcount[i]);
    }
    public int findcommon(int arr1[],int arr2[],int arr3[])
  {
      arrcount = new int[20];
        for(int i=0;i<arr1.length;i++)
     {   
            for(int j=0;j<arr2.length;j++)
        {
                if(arr1[i]==arr2[j])
            {
                for(int k=0;k<arr3.length;k++)
                {
                      if(arr2[j]==arr3[k])
                    {
                        arrcount[c]=arr2[j];c++;
                             } 

                    }
                }
            }
        }
        return c;
    }
}

        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Array size ");
        int n1=sc.nextInt();
        int arr1[]= new int[n1];
        System.out.print("Enter the 2nd Array size ");
        int n2=sc.nextInt();
        int arr2[]= new int[n2];
        System.out.print("Enter the 3rd Array size ");
        int n3=sc.nextInt();
        int arr3[]= new int[n3];
        System.out.println(" ");
        System.out.println("Enter the values of 1st array :");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
                }
        System.out.println("Enter the values of 2nd array :");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
                }
                System.out.println("Enter the values of 3rd array :");
        for(int i=0;i<n3;i++)
        {
            arr3[i]=sc.nextInt();
                }
     Commonelement commonele = new Commonelement();
           int range = commonele.findcommon(arr1,arr2,arr3);
          commonele.getcommonele();
     
    }
} 